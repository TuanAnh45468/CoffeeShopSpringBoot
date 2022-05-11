package finalProject.CoffeeShop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import finalProject.CoffeeShop.entity.Account;
import finalProject.CoffeeShop.entity.User;
import finalProject.CoffeeShop.service.AccountService;
import finalProject.CoffeeShop.service.UserService;

@RestController
public class ShopController {
	private UserService userService;
	private AccountService accountService;
	
	@Autowired
	public ShopController(AccountService theAccountService) {
		accountService = theAccountService;
	}
	
	@PostMapping("/users")
	public Account addUser(@RequestBody Account theAccount) {
		theAccount.setId(0);
		
		accountService.save(theAccount);
		
		return theAccount;
	}
	
	@GetMapping("/shop-v1")
	public String showShop() {
		return "shop-v1";
	}
	
	
}
