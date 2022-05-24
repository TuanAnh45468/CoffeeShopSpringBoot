package finalProject.CoffeeShop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import finalProject.CoffeeShop.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{

}
