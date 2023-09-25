package ngothanhcong.movie.services;

import java.util.Optional;


import ngothanhcong.movie.entity.User;

public interface UserService {
	public boolean addUser(User user);
	
//	public boolean checkEmail(String email);
	
	public Optional<User> findByEmail(String email);
	
	public Optional<User> findByPhone(String phone);
	
}