package finalProject.CoffeeShop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import finalProject.CoffeeShop.dao.CartRepository;
import finalProject.CoffeeShop.entity.Cart;

public class CartServiceImpl implements CartService {

	private CartRepository cartRepository;
	
	@Autowired
	public CartServiceImpl(CartRepository repository) {
		cartRepository = repository;
	}
	
	@Override
	public List<Cart> findAll() {
		// TODO Auto-generated method stub
		return cartRepository.findAll();
	}

	@Override
	public Cart findById(int theId) {
		// TODO Auto-generated method stub
		Optional<Cart> result = cartRepository.findById(theId);
		
		Cart cart = null;
		
		if(result.isPresent()) {
			cart = result.get();
		} else {
			throw new RuntimeException("Did not find the id " + theId);
		}
		return cart;
	}

	@Override
	public void save(Cart theCart) {
		// TODO Auto-generated method stub
		cartRepository.save(theCart);
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		cartRepository.deleteById(theId);
	}

}
