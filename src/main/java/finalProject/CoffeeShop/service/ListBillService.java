package finalProject.CoffeeShop.service;

import java.util.List;

import finalProject.CoffeeShop.entity.ListBill;

public interface ListBillService {
	
	public List<ListBill> findAll();
	
	public ListBill findById(int theId);
	
	public void save(ListBill theListBill);
	
	public void deleteById(int theId);
}
