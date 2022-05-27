package finalProject.CoffeeShop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Checkout implements ControllerInterface{
	
	@Override
	@GetMapping("/checkout")
	public String redirect() {
		// TODO Auto-generated method stub
		return "checkout";
	}
}
