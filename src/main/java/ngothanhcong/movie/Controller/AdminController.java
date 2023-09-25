package ngothanhcong.movie.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ngothanhcong.movie.entity.ServiceModel;
import ngothanhcong.movie.entity.User;
import ngothanhcong.movie.services.MovieServiceImpl;
import ngothanhcong.movie.services.UserServiceImpl;


@Controller
public class AdminController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	@Autowired
	private MovieServiceImpl movieServiceImpl;
	
	@GetMapping("admin/listMovie")
	public String listMovie(Model model) {
		List<ServiceModel> listMovie = movieServiceImpl.findByAllMovie();
		model.addAttribute("listMovie",listMovie);
		
		return "ListMovie";
	}
	
	@GetMapping("admin/listUser")
	public String listUser(Model model) {
		List<User> listUser = userServiceImpl.ListUser();
		model.addAttribute("listUser",listUser);
		return "ListUser";
	}
	
	@GetMapping("admin/listUser/delete/{username}")
	public String deleteUser(@RequestParam String username) {
		userServiceImpl.deleteById(username);
		return "redirect:/admin/listUser";
	}
	
	@GetMapping("admin/listUser/edit/{username}")
	public String editUser(@RequestParam String username, Model model) {
		User editUser = userServiceImpl.findByIdUser(username);
		
		model.addAttribute("account",editUser);
		return "EditUser";
	}
	@GetMapping("admin/listMovie/delete/{name}")
	public String deleteMovie(@RequestParam String name) {
		movieServiceImpl.DeleteById(name);
		return "redirect:/admin/listMovie";
	}
	@GetMapping("admin/listMovie/edit/{name}")
	public String editMovie(@RequestParam String name, Model model) {
		ServiceModel editMovie = movieServiceImpl.findById(name);
		model.addAttribute("editMovies",editMovie);
		return "EditMovie";
	}
	
	
	@PostMapping("/update")
	public String update(@ModelAttribute User user) {
		userServiceImpl.addUser(user);
		return "redirect:/admin/listUser";
	}
	
	@PostMapping("/updateMovie")
	public String updateMovie(@ModelAttribute ServiceModel serviceModel) {
		movieServiceImpl.addMovie(serviceModel);
		return "redirect:/admin/listMovie";
	}
	
	@GetMapping("admin/listMovie/editMovie")
	public String createMovie() {
		return "EditMovie";
	}
	
	
	
}
