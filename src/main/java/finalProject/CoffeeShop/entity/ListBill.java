package finalProject.CoffeeShop.entity;

import java.util.Date;

public class ListBill {
	private int id;
	private int userId;
	private Date date;
	
	public ListBill() {
			
	}

	public ListBill(int id, int userId, Date date) {
		super();
		this.id = id;
		this.userId = userId;
		this.date = date;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ListBill [id=" + id + ", userId=" + userId + ", date=" + date + "]";
	}
	
	
}
