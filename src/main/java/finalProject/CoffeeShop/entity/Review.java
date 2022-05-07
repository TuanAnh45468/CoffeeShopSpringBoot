package finalProject.CoffeeShop.entity;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="review")
public class Review {
	
	private int userId;
	
	private int productId;
	
	private String comment;
	
	private int rate;
	
	public Review() {
		
	}

	public Review(int userId, int productId, String comment, int rate) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.comment = comment;
		this.rate = rate;
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
		return "Review [userId=" + userId + ", productId=" + productId + ", comment=" + comment
				+ ", rate=" + rate + "]";
	}
	
	
}
