package finalProject.CoffeeShop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import finalProject.CoffeeShop.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
