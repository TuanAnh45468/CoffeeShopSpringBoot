package finalProject.CoffeeShop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import finalProject.CoffeeShop.entity.User;
import finalProject.CoffeeShop.service.RoleService;
import finalProject.CoffeeShop.service.UserService;

@Controller
public class ShopController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	//mapping for homepage
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
