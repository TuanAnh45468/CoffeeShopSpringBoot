package finalProject.CoffeeShop.service;

import java.util.List;

import finalProject.CoffeeShop.entity.User;

public interface UserService {

	public List<User> findAll();
	
	public User findById(int theId);
	
	public void save(User theUser);
	
	public void deleteById(int theId);
}
