package ngothanhcong.movie.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ngothanhcong.movie.DAO.UserDetailsDTO;
import ngothanhcong.movie.entity.User;
import ngothanhcong.movie.services.UserDetailsServiceImpl;
@Controller
public class HomeController {
//	@Autowired
//	private UserDetailsService userDeService;
	@GetMapping(value ="/admin")
	public String home(Model model, HttpSession session) {
		UsernamePasswordAuthenticationToken authenication = (UsernamePasswordAuthenticationToken) SecurityContextHolder
				.getContext().getAuthentication();
		
		validatePrinciple(authenication.getPrincipal());
		
		User loggedInUser = ((UserDetailsDTO)authenication.getPrincipal()).getUserDetails();
		
		session.setAttribute("userId", loggedInUser.getUsername());
		return "admin";
	}
	
	private void validatePrinciple(Object principle) {
		if (!(principle instanceof UserDetailsDTO)) {
			throw new IllegalArgumentException("Principle can not be null!");
		}
	}
	
	@GetMapping(value = "/register")
	public String register() {
		return "Sign-Up";
	}
	
	
	
	@GetMapping("/home")
	public String homePage(Model model, HttpSession session) {
		UsernamePasswordAuthenticationToken authenication = (UsernamePasswordAuthenticationToken) SecurityContextHolder
				.getContext().getAuthentication();
		
		validatePrinciple(authenication.getPrincipal());
		
		User loggedInUser = ((UserDetailsDTO)authenication.getPrincipal()).getUserDetails();
		
		session.setAttribute("userId", loggedInUser.getUsername());
		return "home-page";
	}
	
	@GetMapping("home/default")
	public String homeVideo() {
		return "default";
	}
	
	
	
	
}
