package ngothanhcong.movie.Controller;

import java.lang.ProcessBuilder.Redirect;
import java.security.Principal;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean2a;
import org.apache.taglibs.standard.tag.common.xml.IfTag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import ngothanhcong.movie.services.UserDetailsServiceImpl;
import ngothanhcong.movie.services.UserServiceImpl;
import ngothanhcong.movie.entity.Authorities;
import ngothanhcong.movie.entity.User;

@Controller
@SessionAttributes({ "currentUser" })

public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@GetMapping("login")
	public String loginPage(Principal principal, HttpSession session) {
		return principal == null ? "login" : "redirect:/admin";
	}

//		@PostMapping("login")
//		public void postLogin(Model model, HttpSession session) {
//			UsernamePasswordAuthenticationToken authenication = (UsernamePasswordAuthenticationToken) SecurityContextHolder
//					.getContext().getAuthentication();
//			
//			validatePrinciple(authenication.getPrincipal());
//			
//			User loggedInUser = ((UserDetailsDTO)authenication.getPrincipal()).getUserDetails();
//			
//			model.addAttribute("currentUser", loggedInUser.getUsername());
//			session.setAttribute("userId", loggedInUser.getUsername());

//		}

	@GetMapping("loginFailed")
	public String loginError(Model model) {
		model.addAttribute("error", "true");
		return "login";
	}

	@GetMapping("logout")
	public ModelAndView logoutPage(SessionStatus session) {
		SecurityContextHolder.getContext().setAuthentication(null);
		session.setComplete();

		return new ModelAndView("login");
	}

	@PostMapping("/register")
	public String insertUser(@ModelAttribute User user, HttpSession session, Model model) {

		boolean check = userServiceImpl.checkUserName(user.getUsername());
		Optional<User> checkemail = userServiceImpl.findByEmail(user.getEmail());
		Optional<User> checkphone = userServiceImpl.findByPhone(user.getPhone());
		if (check) {
//				session.setAttribute("message", "UserName is already exits!!!!");
//			System.err.println("UserName already exists!!!");
			model.addAttribute( "message","UserName is already exists!!!");
			return "Sign-Up";
		} else if (checkemail.isPresent()) {
//			System.err.println("Email is already used!!!");
//				session.setAttribute("message", "is already exits!!!!");
			model.addAttribute( "message","Email is already exists!!!");
			return "Sign-Up";
		} else if (checkphone.isPresent()) {
//			System.err.println("Phone already exists!!!");
			model.addAttribute( "message","Phone is already exists!!!");
			return "Sign-Up";
		} else if (!user.getPassword().equals(user.getConfirmPassword())) {
//			System.err.println("Password and ConfirmPassword don't match!!!!");
			model.addAttribute( "message","Password and ConfirmPassword don't match!!!");
			return "Sign-Up";
		} else {
			boolean isResult = userServiceImpl.addUser(user);

			if (isResult) {

//					   session.setAttribute("message", "Register Account successfully!!!");
				System.err.println("Register Account successfully");
				return "login";
			} else {
//				session.setAttribute("message", "Please Enter Again!!!");
				System.out.println("Please try again!!!");
			}
		}
		return "redirect:/login";

	}

	@GetMapping("/resetPassword/{username}")
	public String ShowFormUpdatePassword(@PathVariable String username, Model model) {
		model.addAttribute("username", username);
		return "Reset-Password";
	}

	@GetMapping("forgetPassword")
	public String ShowFormForgetPassword() {
		return "Forget-Password";
	}

	@PostMapping("forgetPassword")
	public String forgetPassword(@RequestParam String email,Model model) {
		Optional<User> user = userServiceImpl.findByEmail(email);
		if (user.isPresent()) {
			System.out.println("Email adready exists!!!");
			return "redirect:/resetPassword/" + user.get().getUsername();

		} else {
			System.out.println("Email not  adready exists !!!");
			model.addAttribute("message","Email not  adready exists !!!");
			return "Forget-Password";
		}

	}

	@PostMapping("/changePassword")
	public String updatePassword(@RequestParam String username, @RequestParam String password,@RequestParam String confirmPassword ,Model model ) {
		User user = userServiceImpl.findByIdUser(username);
//		String ercry = passwordEncoder.encode(password);
//		user.setPassword(ercry);
		
		user.setPassword(password);
		user.setConfirmPassword(confirmPassword);
		if(!user.getPassword().equals(user.getConfirmPassword())) {
			System.err.println("Password and Confirm don't match!!!");
			return "redirect:/resetPassword/" + user.getUsername();
		}else 
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			userServiceImpl.updateUser(user);
			System.out.println("Update successfully!!!");
			return "redirect:/login";
			
}
}