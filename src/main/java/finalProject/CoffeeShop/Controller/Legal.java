package finalProject.CoffeeShop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Legal implements ControllerInterface{

	@Override
	@GetMapping("/legal")
	public String redirect() {
		// TODO Auto-generated method stub
		return "legal";
	}
}
