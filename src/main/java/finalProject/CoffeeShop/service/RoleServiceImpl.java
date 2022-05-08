package finalProject.CoffeeShop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalProject.CoffeeShop.dao.RoleRepository;
import finalProject.CoffeeShop.entity.Account;
import finalProject.CoffeeShop.entity.Role;

@Service
public class RoleServiceImpl implements RoleService {
	private RoleRepository roleRepository;
	
	@Autowired
	public RoleServiceImpl(RoleRepository theRoleRepository) {
		roleRepository = theRoleRepository;
	}
	
	
	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public Role findById(int theId) {
		// TODO Auto-generated method stub
		Optional<Role> result = roleRepository.findById(theId);
		
		Role role = null;
		
		if(result.isPresent()) {
			role = result.get();
		} else {
			throw new RuntimeException("Did not find the account " + theId);
		}
		
		return role;
	}

	@Override
	public void save(Role theRole) {
		// TODO Auto-generated method stub
		roleRepository.save(theRole);
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		roleRepository.deleteById(theId);
	}

}
