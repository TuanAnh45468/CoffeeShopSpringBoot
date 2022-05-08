package finalProject.CoffeeShop.service;

import java.util.List;

import finalProject.CoffeeShop.entity.BillingDetail;

public interface BillingDetailService {

	public List<BillingDetail> findAll();
	
	public BillingDetail findById(int theId);
	
	public void save(BillingDetail theEmployee);
	
	public void deleteById(int theId);
}
