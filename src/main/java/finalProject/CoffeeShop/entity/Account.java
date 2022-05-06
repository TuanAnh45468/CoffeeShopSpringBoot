package finalProject.CoffeeShop.entity;

public class Account {

	private int id;
	private  int userId;
	private String name;
	private String password;
	
	public Account() {
		
	}

	public Account(int id, int id_user, String name, String password) {
		super();
		this.id = id;
		this.userId = id_user;
		this.name = name;
		this.password = password;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", id_user=" + userId + ", name=" + name + ", password=" + password + "]";
	}
	
	
	
}
