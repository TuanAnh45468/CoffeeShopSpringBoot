package finalProject.CoffeeShop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalProject.CoffeeShop.dao.CategoryRepository;
import finalProject.CoffeeShop.entity.Category;

@Service
public class CategoryServiceImpl implements CategoryService {
	private CategoryRepository categoryRepository;
	
	@Autowired
	public CategoryServiceImpl(CategoryRepository theCategoryRepository) {
		categoryRepository = theCategoryRepository;
	}
	
	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category findById(int theId) {
		Optional<Category> result = categoryRepository.findById(theId);
		
		Category category = null;
		
		if(result.isPresent()) {
			category = result.get();
		} else {
			throw new RuntimeException("Did not find the account " + theId);
		}
		
		return category;
	}

	@Override
	public void save(Category theCategory) {
		categoryRepository.save(theCategory);
	}

	@Override
	public void deleteById(int theId) {
		categoryRepository.deleteById(theId);
	}

}
