package ngothanhcong.movie.repository;

import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import antlr.collections.List;
import ngothanhcong.movie.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,String> {
	
	public boolean existsById(String username);
	
//	public boolean exitsByEmail (String email);
	
	
	public Optional<User> findByEmail(String email);
	
//	public User findByResetPasswordToken(String token);
	public Optional<User> findByPhone(String phone);
	
//	
//	public User findByEmailToken(String email);
	
}
