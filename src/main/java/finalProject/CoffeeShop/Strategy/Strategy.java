package finalProject.CoffeeShop.Strategy;

import java.util.List;

import finalProject.CoffeeShop.entity.ProductDetail;

public interface Strategy {
	List<ProductDetail> doStuff();
	StrategyName getStrategyName();
	
	public enum StrategyName{
		sortByName,
		sortByBrand
	}
}
