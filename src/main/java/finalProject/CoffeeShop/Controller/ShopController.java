package finalProject.CoffeeShop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import finalProject.CoffeeShop.dto.GlobalData;
import finalProject.CoffeeShop.entity.ProductDetail;
import finalProject.CoffeeShop.service.ProductDetailService;


@Controller
public class ShopController {
	
	@Autowired
	private ProductDetailService productDetailService;
	
	@GetMapping("/login")
	public String login() {
		GlobalData.cart.clear();
		return "login";
	}
	
	//mapping for homepage
	@GetMapping("/")
	public String index(Model model) {
		//ProductDetail productDetail = new ProductDetail();
		model.addAttribute("cartCount", GlobalData.cart.size());
		model.addAttribute("total", GlobalData.cart.stream().mapToDouble(ProductDetail::getPrice).sum());
		model.addAttribute("products", productDetailService.findAll());
		
		return "index";
	}
}
