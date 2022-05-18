package finalProject.CoffeeShop.Controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import finalProject.CoffeeShop.dto.ProductDetailDTO;
import finalProject.CoffeeShop.entity.ProductDetail;
import finalProject.CoffeeShop.service.CategoryService;
import finalProject.CoffeeShop.service.ProductDetailService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	public static String uploadDir = System.getProperty("user.dir") + "/src/main/resources/static/assets/img";
	
	@Autowired
	ProductDetailService productDetailService;
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/")
	public String adminHomepage() {
		return "admin";
	}
	
	@GetMapping("/products")
	public String showProduct(Model model) {
		model.addAttribute("products", productDetailService.findAll());
		return "products"; //pass model data to the view
	}
	
	@GetMapping("/product/addQuantity")
	public String showAddQuantity() {
		return "product-add";
	}
	
	@GetMapping("/product/create")
	public String showAddProduct(Model model) {
		model.addAttribute("productDTO", new ProductDetailDTO());
		model.addAttribute("categories", categoryService.findAll());
		return "product-create";
	}
	
	@PostMapping("/product/create")
	public String createProduct(@ModelAttribute("productDTO") ProductDetailDTO productDetailDTO){
		
		ProductDetail productDetail = new ProductDetail();
		productDetail.setId(productDetailDTO.getId());
		productDetail.setName(productDetailDTO.getName());
		System.out.println(productDetail.getName());
		productDetail.setDescription(productDetailDTO.getDescription());
		productDetail.setCategory(categoryService.findById(productDetailDTO.getCategoryID()));
		productDetail.setBrand(productDetailDTO.getBrand());
		productDetail.setBreed(productDetailDTO.getBreed());
		productDetail.setWeight(productDetailDTO.getWeight());
		productDetail.setQuantity(productDetailDTO.getQuantity());
		productDetail.setPrice(productDetailDTO.getPrice());
		
		productDetailService.save(productDetail);
		return "redirect:/admin/products";
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
