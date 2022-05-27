package finalProject.CoffeeShop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Contact implements ControllerInterface{
	
	@Override
	@GetMapping("/contact-us")
	public String redirect() {
		// TODO Auto-generated method stub
		return "contact-us";
	}
}
