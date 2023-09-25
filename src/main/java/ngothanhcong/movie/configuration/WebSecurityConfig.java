package ngothanhcong.movie.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import ngothanhcong.movie.services.UserDetailsServiceImpl;
@EnableWebSecurity
public class WebSecurityConfig {

	
	@Bean
	public UserDetailsService userService() {
		return new UserDetailsServiceImpl();
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/admin").hasAnyRole("ADMIN","USER")
		.and().authorizeRequests().antMatchers("/home").permitAll()
		.antMatchers("/resources/**")
				.permitAll().and().formLogin().loginPage("/login").usernameParameter("username")
				.passwordParameter("password").loginProcessingUrl("/login").defaultSuccessUrl("/home").permitAll().failureUrl("/loginFailed").and()
				.logout().logoutUrl("/logout").logoutSuccessUrl("/login").permitAll().and().csrf().disable();

		return http.build();
	}
}

