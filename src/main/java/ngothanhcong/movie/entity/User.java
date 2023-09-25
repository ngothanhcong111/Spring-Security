package ngothanhcong.movie.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="user")
public class User {
	
	

	

	@Id
	@Column(name = "username")
//	@Size(min=10,max =20,message="Username  invalid format")
	private  String username;
//	@Pattern(regexp = "[^a-zA-Z0-9]{20}", message="Password invalid format")
	@Column(name="password")
	private String password;

	@Column(name="email")
	private String email;
	
	@Column(name="confirmPassword")
	private String confirmPassword;
	
	

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Column(name="phone")
	private String phone;
	
	@Column(name="birthday")
	private String birthDay;
	
	@Column(name = "gender")
	private boolean gender ;
	
	@Column(name= "enabled")
	private boolean enabled;
	
	

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.EAGER)
	private Set<Authorities> authorities = new HashSet<>();
	
	
	public Set<Authorities> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<Authorities> authorities) {
		this.authorities = authorities;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}


	public boolean isEnabled() {
		return enabled;
	}

	public void setEnable(boolean enabled) {
		this.enabled = enabled;
	}

	
}
