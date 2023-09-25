package ngothanhcong.movie.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;




import ngothanhcong.movie.entity.User;
import ngothanhcong.movie.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	
	
	
//	public void updateResetPasswordToken(String token, String email) {
//		User user = userRepository.findByEmailToken(email);
//		if(user !=null) {
//			user.setResetPassword(token);
//			userRepository.save(user);
//			
//		}else {
//			System.err.println("Can not find user with email!!! ");
//			
//		}
//		
//	}



//	@Override
//	public void updatePassword(User user, String newPassword) {
//		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//		String encodedPasswrod = bCryptPasswordEncoder.encode(newPassword);
//		user.setPassword(encodedPasswrod);
//		user.setResetPassword(null);
//		userRepository.save(user);
//		
//	}



//	@Override
//	public User getByResetPassword(String token) {
//		// TODO Auto-generated method stub
//		return userRepository.findByResetPassword(token);
//	}
//	
//	
//
	@Override
	public boolean addUser(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setEnable(true);
		return userRepository.save(user)!=null;
	}
	
	public boolean  checkUserName(String username) {
		return  userRepository.existsById(username);
	}
	
	
	public List<User> ListUser(){
		
		return (List<User>) userRepository.findAll();
	}
	
	public void deleteById(String username) {
		userRepository.deleteById(username);
	}
	public User findByIdUser(String username) {
	  Optional<User> e = userRepository.findById(username);
	  
	  if(e.isPresent()) {
		  return e.get();
	  }
	  return null;
	}

	
	


	@Override
	public Optional<User> findByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email) ;
	}
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public Optional<User> findByPhone(String phone) {
		
		return userRepository.findByPhone(phone);
	}

	
	
	


//	@Override
//	public boolean checkEmail(String email) {
//		
//		return userRepository.existByEmail(email);
//	}
	
	 
	
}
