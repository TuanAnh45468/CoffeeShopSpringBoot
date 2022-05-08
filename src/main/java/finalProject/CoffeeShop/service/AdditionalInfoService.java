package finalProject.CoffeeShop.service;

import java.util.List;

import finalProject.CoffeeShop.entity.AdditionalInfo;

public interface AdditionalInfoService {
	public List<AdditionalInfo> findAll();
	
	public AdditionalInfo findById(int theId);
	
	public void save(AdditionalInfo theAdditionalInfo);
	
	public void deleteById(int theId);
}
