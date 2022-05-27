package finalProject.CoffeeShop.Strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import finalProject.CoffeeShop.Strategy.Strategy.StrategyName;

@Component
public class StrategyFactory {
	private Map<StrategyName, Strategy> strategies;
	
//	@Autowired
//	public StrategyFactory() {
//		
//	}
	
	@Autowired
	public StrategyFactory(Set<Strategy> strategySet) {
		createStrategy(strategySet);
	}
	
	public Strategy findStrategy(StrategyName strategyName) {
		return strategies.get(strategyName);
	}
	
	private void createStrategy(Set<Strategy> strategySet) {
		strategies = new HashMap<StrategyName, Strategy>();
		strategySet.forEach(strategy -> strategies.put(strategy.getStrategyName(), strategy));
	}
}
