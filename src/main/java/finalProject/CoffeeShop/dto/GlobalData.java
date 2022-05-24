package finalProject.CoffeeShop.dto;

import java.util.ArrayList;
import java.util.List;

import finalProject.CoffeeShop.entity.ProductDetail;

public class GlobalData {
	public static List<ProductDetail> cart;
	
	static {
		cart = new ArrayList<ProductDetail>();
	}
}
