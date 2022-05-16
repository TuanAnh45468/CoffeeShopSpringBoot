package finalProject.CoffeeShop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping("/")
	public String adminHomepage() {
		return "admin";
	}
	
	@GetMapping("/products")
	public String showProduct() {
		return "products";
	}
	
	@GetMapping("/addQuantity")
	public String showAddQuantity() {
		return "product-add";
	}
	
	@GetMapping("/create")
	public String showAddProduct() {
		return "product-create";
	}
	
	@GetMapping("/detail")
	public String showProductDetail() {
		return "product-detail";
	}
	
	@GetMapping("/edit")
	public String showEditProduct() {
		return "product-edit";
	}
	
}
