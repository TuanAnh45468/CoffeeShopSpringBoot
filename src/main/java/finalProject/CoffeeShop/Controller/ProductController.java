package finalProject.CoffeeShop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import finalProject.CoffeeShop.entity.ProductDetail;
import finalProject.CoffeeShop.service.ProductDetailService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductDetailService productDetailService;
	
	@GetMapping("/product-single")
	public String showProductDetail(@RequestParam("productId") int theId, Model model) {
		//get the product from service
		ProductDetail theProduct = productDetailService.findById(theId);
		model.addAttribute("products", theProduct);
		return "product-single";
	}
}
