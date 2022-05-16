package finalProject.CoffeeShop.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import finalProject.CoffeeShop.dto.UserRegistrationDto;
import finalProject.CoffeeShop.entity.User;

public interface UserService extends UserDetailsService{
	
	User save(UserRegistrationDto registrationDto);
}
