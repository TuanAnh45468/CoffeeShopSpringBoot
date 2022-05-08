package finalProject.CoffeeShop.service;

import java.util.List;

import finalProject.CoffeeShop.entity.ProductDetail;

public interface ProductDetailService {
	public List<ProductDetail> findAll();
	
	public ProductDetail findById(int theId);
	
	public void save(ProductDetail theProductDetail);
	
	public void deleteById(int theId);
}
