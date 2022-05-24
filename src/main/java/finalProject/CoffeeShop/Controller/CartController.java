package finalProject.CoffeeShop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import finalProject.CoffeeShop.dto.GlobalData;
import finalProject.CoffeeShop.entity.ProductDetail;
import finalProject.CoffeeShop.service.ProductDetailService;

@Controller
public class CartController {
	
	@Autowired
	private ProductDetailService productDetailService;
	
	@GetMapping("/addToCart")
	public String addToCart(@RequestParam("productId") int theId, Model model) {
		//get the product from service
		GlobalData.cart.add(productDetailService.findById(theId));
		//ProductDetail theProduct = productDetailService.findById(theId);
		//model.addAttribute("products", theProduct);
		return "redirect:/";
	}
	
	@GetMapping("/cart")
	public String cartGet(Model model) {
		model.addAttribute("cartCount", GlobalData.cart.size());
		model.addAttribute("total", GlobalData.cart.stream().mapToDouble(ProductDetail::getPrice).sum());
		model.addAttribute("cart", GlobalData.cart);
		return "cart";
	}
	
	@GetMapping("/cart/removeItem/{index}")
	public String cartItemRemove(@PathVariable int index) {
		GlobalData.cart.remove(index);
		return "redirect:/cart";
	}
}
