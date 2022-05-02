package finalProject.CoffeeShop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	//mapping for homepage
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/loginOrigin")
	public String login() {
		return "login";
	}
	
}
