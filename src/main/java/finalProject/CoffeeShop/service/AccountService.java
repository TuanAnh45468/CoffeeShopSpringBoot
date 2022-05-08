package finalProject.CoffeeShop.service;

import java.util.List;

import finalProject.CoffeeShop.entity.Account;


public interface AccountService {
	public List<Account> findAll();
	
	public Account findById(int theId);
	
	public void save(Account theEmployee);
	
	public void deleteById(int theId);
}
