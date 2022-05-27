package finalProject.CoffeeShop.Strategy;

import java.util.List;

import org.springframework.data.domain.Sort;

import finalProject.CoffeeShop.dao.ProductDetailRepository;
import finalProject.CoffeeShop.entity.ProductDetail;

public class sortByName implements Strategy{
	private ProductDetailRepository detailRepository;
	
	@Override
	public List<ProductDetail> doStuff() {
		// TODO Auto-generated method stub
		return detailRepository.findAll(Sort.by("name"));
	}

	@Override
	public StrategyName getStrategyName() {
		// TODO Auto-generated method stub
		return StrategyName.sortByName;
	}

}
