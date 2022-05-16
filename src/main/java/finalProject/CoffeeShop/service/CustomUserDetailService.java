package finalProject.CoffeeShop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import finalProject.CoffeeShop.dao.UserRepository;
import finalProject.CoffeeShop.entity.CustomUserDetail;
import finalProject.CoffeeShop.entity.User;

@Service
public class CustomUserDetailService implements UserDetailsService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user = userRepository.findUserByEmail(username);
		user.orElseThrow(()-> new UsernameNotFoundException("User not found"));
		return user.map(CustomUserDetail::new).get();
	}
	
	public Optional<User> findUserByEmail(String email) {
		return userRepository.findUserByEmail(email);
	}
	
}
