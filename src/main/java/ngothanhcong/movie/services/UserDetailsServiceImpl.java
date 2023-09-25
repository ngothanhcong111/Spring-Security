package ngothanhcong.movie.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import ngothanhcong.movie.DAO.UserDetailsDTO;
import ngothanhcong.movie.entity.User;
import ngothanhcong.movie.repository.UserRepository;

@Service("userService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findById(username).get();
		
		
		if (user == null) {
			throw new UsernameNotFoundException("User not found");
		}
		
		return new UserDetailsDTO(user);
	}
}
