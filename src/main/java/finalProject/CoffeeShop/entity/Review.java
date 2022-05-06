package finalProject.CoffeeShop.entity;

public class Review {
	private int id;
	private int userId;
	private int productId;
	private String comment;
	private int rate;
	
	public Review() {
		
	}

	public Review(int id, int userId, int productId, String comment, int rate) {
		super();
		this.id = id;
		this.userId = userId;
		this.productId = productId;
		this.comment = comment;
		this.rate = rate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", userId=" + userId + ", productId=" + productId + ", comment=" + comment
				+ ", rate=" + rate + "]";
	}
	
	
}
