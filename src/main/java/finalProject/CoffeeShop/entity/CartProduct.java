package finalProject.CoffeeShop.entity;

public class CartProduct {

	private int userId;
	private int productId;
	private int productQuantity;
	private int totalPrice;
	
	public CartProduct() {
		
	}

	public CartProduct(int userId, int productId, int productQuantity, int totalPrice) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.productQuantity = productQuantity;
		this.totalPrice = totalPrice;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "CartProduct [userId=" + userId + ", productId=" + productId + ", productQuantity=" + productQuantity
				+ ", totalPrice=" + totalPrice + "]";
	}
	
	
	
}
