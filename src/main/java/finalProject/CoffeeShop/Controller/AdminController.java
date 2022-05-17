package finalProject.CoffeeShop.Controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import finalProject.CoffeeShop.dto.ProductDetailDTO;
import finalProject.CoffeeShop.entity.Category;
import finalProject.CoffeeShop.entity.ProductDetail;
import finalProject.CoffeeShop.service.CategoryService;
import finalProject.CoffeeShop.service.ProductDetailService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	public AdminController() {
		
	}
	
	ProductDetailService productDetailService;
	
	public AdminController(ProductDetailService productDetailService) {
		this.productDetailService = productDetailService;
	}
	
	
	CategoryService categoryService;
	
	public AdminController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@GetMapping("/home")
	public String adminHomepage() {
		return "admin";
	}
	
	@GetMapping("/products")
	public String showProduct(Model model) {
		model.addAttribute("products", productDetailService.findAll());
		return "products"; //pass model data to the view
	}
	
	@GetMapping("/product/category")
	public String showCategory(Model model) {
		//get categories from DB
		List<Category> categoryList = categoryService.findAll();
		model.addAttribute("categories", categoryList);
		return "products";
	}
	
	@GetMapping("/product/addQuantity")
	public String showAddQuantity() {
		return "product-add";
	}
	
	@GetMapping("/product/create")
	public String showAddProduct(Model model) {
		//ProductDetail theProductDetail = new ProductDetail();
		
		model.addAttribute("productDetail", new ProductDetail());
		
//		List<Category> categoryList = categoryService.findAll();
//		model.addAttribute("categories", categoryList);
		return "product-create";
	}
	
	@PostMapping("/product/save")
	public String createProduct(@ModelAttribute("productDetail") ProductDetail theProductDetail) {
		productDetailService.save(theProductDetail);
		return "redirect:/admin/product/detail";
	}
	
	@GetMapping("/product/detail")
	public String showProductDetail() {
		return "product-detail";
	}
	
	@GetMapping("/product/edit")
	public String showEditProduct() {
		return "product-edit";
	}
	
}
