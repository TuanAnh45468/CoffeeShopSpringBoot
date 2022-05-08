package finalProject.CoffeeShop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalProject.CoffeeShop.dao.AccountRepository;
import finalProject.CoffeeShop.entity.Account;

@Service
public class AccountServiceImpl implements AccountService {
	
	private AccountRepository accRepository;

	@Autowired
	public AccountServiceImpl(AccountRepository theAccountRepository) {
		accRepository = theAccountRepository;
	}
	
	@Override
	public List<Account> findAll() {
		return accRepository.findAll();
	}

	@Override
	public Account findById(int theId) {
		Optional<Account> result = accRepository.findById(theId);
		
		Account account = null;
		
		if(result.isPresent()) {
			account = result.get();
		} else {
			throw new RuntimeException("Did not find the account " + theId);
		}
		
		return account;
	}

	@Override
	public void save(Account theAccount) {
		accRepository.save(theAccount);
	}

	@Override
	public void deleteById(int theId) {
		accRepository.deleteById(theId);
	}

}
