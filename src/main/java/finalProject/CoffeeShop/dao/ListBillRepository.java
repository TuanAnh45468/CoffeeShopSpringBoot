package finalProject.CoffeeShop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import finalProject.CoffeeShop.entity.ListBill;

public interface ListBillRepository extends JpaRepository<ListBill, Integer> {
	
}
