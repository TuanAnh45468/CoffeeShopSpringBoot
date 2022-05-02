package finalProject.Shopman.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {
	
	@GetMapping("/shop-v1")
	public String showShop() {
		return "shop-v1";
	}
}
