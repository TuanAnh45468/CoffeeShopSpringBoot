package finalProject.CoffeeShop.service;

import java.util.List;

import finalProject.CoffeeShop.entity.Role;

public interface RoleService {
	
	public List<Role> findAll();
	
	public Role findById(int theId);
	
	public void save(Role theRole);
	
	public void deleteById(int theId);
}
