package finalProject.CoffeeShop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalProject.CoffeeShop.dao.ListBillRepository;
import finalProject.CoffeeShop.entity.ListBill;

@Service
public class ListBillServiceImpl implements ListBillService {
	private ListBillRepository listBillRepository;
	
	@Autowired
	public ListBillServiceImpl(ListBillRepository theListBillRepository) {
		listBillRepository = theListBillRepository;
	}
	
	
	@Override
	public List<ListBill> findAll() {
		return listBillRepository.findAll();
	}

	@Override
	public ListBill findById(int theId) {
		Optional<ListBill> result = listBillRepository.findById(theId);
		
		ListBill listBill = null;
		
		if(result.isPresent()) {
			listBill = result.get();
		} else {
			throw new RuntimeException("Did not find the account " + theId);
		}
		
		return listBill;
	}

	@Override
	public void save(ListBill theListBill) {
		listBillRepository.save(theListBill);
	}

	@Override
	public void deleteById(int theId) {
		listBillRepository.deleteById(theId);
	}

}
