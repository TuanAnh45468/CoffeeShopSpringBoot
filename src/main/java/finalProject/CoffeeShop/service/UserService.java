package finalProject.CoffeeShop.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import finalProject.CoffeeShop.dto.UserRegistrationDto;
import finalProject.CoffeeShop.entity.User;

public interface UserService extends UserDetailsService{
	
	public User save(UserRegistrationDto registrationDto);

	public List<User> findAll();
	
	public User findById(int theId);
	
	public void deleteById(int theId);
}
