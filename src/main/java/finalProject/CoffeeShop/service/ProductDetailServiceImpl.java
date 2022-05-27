package finalProject.CoffeeShop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import finalProject.CoffeeShop.Strategy.Strategy;
import finalProject.CoffeeShop.Strategy.Strategy.StrategyName;
import finalProject.CoffeeShop.Strategy.StrategyFactory;
import finalProject.CoffeeShop.dao.ProductDetailRepository;
import finalProject.CoffeeShop.entity.ProductDetail;

@Service
public class ProductDetailServiceImpl implements ProductDetailService {
	private ProductDetailRepository productDetailRepository;
	
	@Autowired
	private StrategyFactory strategyFactory;
	
	@Autowired
	public ProductDetailServiceImpl(ProductDetailRepository theProductDetailRepository) {
		productDetailRepository = theProductDetailRepository;
	}
	
	@Override
	public List<ProductDetail> findAll() {
		// TODO Auto-generated method stub
		return productDetailRepository.findAll(Sort.by("quantity"));
	}

	@Override
	public ProductDetail findById(int theId) {
		// TODO Auto-generated method stub
		Optional<ProductDetail> result = productDetailRepository.findById(theId);
		
		ProductDetail productDetail = null;
		
		if(result.isPresent()) {
			productDetail = result.get();
		} else {
			throw new RuntimeException("Did not find the account " + theId);
		}
		
		return productDetail;
	}

	@Override
	public void save(ProductDetail theProductDetail) {
		// TODO Auto-generated method stub
		productDetailRepository.save(theProductDetail);
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		productDetailRepository.deleteById(theId);
	}
	
//	@Override
//	public List<ProductDetail> sortByName( ) {
//		//get Strategy by passing the name
//		Strategy strategy = strategyFactory.findStrategy(StrategyName.sortByName);
//		
//		//call method define in strategy
//		return strategy.doStuff();
//	}
//
//	@Override
//	public List<ProductDetail> sortByBrand() {
//		//get Strategy by passing the name
//		Strategy strategy = strategyFactory.findStrategy(StrategyName.sortByBrand);
//		
//		//call method define in strategy
//		return strategy.doStuff();
//	}
}
