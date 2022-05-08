package finalProject.CoffeeShop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import finalProject.CoffeeShop.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
