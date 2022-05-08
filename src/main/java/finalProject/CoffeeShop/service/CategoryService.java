package finalProject.CoffeeShop.service;

import java.util.List;

import finalProject.CoffeeShop.entity.Category;

public interface CategoryService {

	public List<Category> findAll();
	
	public Category findById(int theId);
	
	public void save(Category theEmployee);
	
	public void deleteById(int theId);
}
