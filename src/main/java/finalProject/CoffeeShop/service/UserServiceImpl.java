package finalProject.CoffeeShop.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import finalProject.CoffeeShop.dao.UserRepository;
import finalProject.CoffeeShop.dto.UserRegistrationDto;
import finalProject.CoffeeShop.entity.Role;
import finalProject.CoffeeShop.entity.User;

@Service
public class UserServiceImpl implements UserService {
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	public UserServiceImpl(UserRepository theUserRepository) {
		super();
		userRepository = theUserRepository;
	}
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User findById(int theId) {
		// TODO Auto-generated method stub
		Optional<User> result = userRepository.findById(theId);
		
		User user = null;
		
		if(result.isPresent()) {
			user = result.get();
		} else {
			throw new RuntimeException("Did not find the account " + theId);
		}
		
		return user;
	}

//	@Override
//	public void save(User theUser) {
//		// TODO Auto-generated method stub
//		userRepository.save(theUser);
//	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(theId);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepository.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException("Invalid username or password");
		}
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
	}
	
	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}

	@Override
	public User save(UserRegistrationDto registrationDto) {
		// TODO Auto-generated method stub
		User user = new User(registrationDto.getName(), 
				registrationDto.getEmail(),
				passwordEncoder.encode(registrationDto.getPassword()), Arrays.asList(new Role("ROLE_USER")));
		return userRepository.save(user);
	}

}
