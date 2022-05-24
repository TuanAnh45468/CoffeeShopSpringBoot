package finalProject.CoffeeShop.service;

import java.util.List;

import finalProject.CoffeeShop.entity.Cart;

public interface CartService {
	
	public List<Cart> findAll();
	
	public Cart findById(int theId);
	
	public void save(Cart theCart);
	
	public void deleteById(int theId);
}
