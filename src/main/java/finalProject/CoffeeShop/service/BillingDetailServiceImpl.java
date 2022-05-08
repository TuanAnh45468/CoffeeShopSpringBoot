package finalProject.CoffeeShop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalProject.CoffeeShop.dao.BillingDetailRepository;
import finalProject.CoffeeShop.entity.BillingDetail;

@Service
public class BillingDetailServiceImpl implements BillingDetailService {
	private BillingDetailRepository detailRepository;
	
	@Autowired
	public BillingDetailServiceImpl(BillingDetailRepository theDetailRepository) {
		detailRepository = theDetailRepository;
	}
	
	@Override
	public List<BillingDetail> findAll() {
		return detailRepository.findAll();
	}

	@Override
	public BillingDetail findById(int theId) {
		Optional<BillingDetail> result = detailRepository.findById(theId);
		
		BillingDetail billingDetail = null;
		
		if(result.isPresent()) {
			billingDetail = result.get();
		} else {
			throw new RuntimeException("Did not find the account " + theId);
		}
		
		return billingDetail;
	}

	@Override
	public void save(BillingDetail theBillingDetail) {
		detailRepository.save(theBillingDetail);
	}

	@Override
	public void deleteById(int theId) {
		detailRepository.deleteById(theId);
	}

}
