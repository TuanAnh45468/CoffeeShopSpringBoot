package finalProject.Shopman.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
	
	@GetMapping("/product-single")
	public String showProductDetail() {
		return "product-single";
	}
}
