package finalProject.CoffeeShop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutUs implements ControllerInterface {

	@Override
	@GetMapping("/about-us")
	public String redirect() {
		// TODO Auto-generated method stub
		return "about-us";
	}

}
