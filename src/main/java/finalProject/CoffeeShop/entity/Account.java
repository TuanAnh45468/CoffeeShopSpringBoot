package finalProject.CoffeeShop.entity;

public class Account {

	private int id;
	private  int id_user;
	private String name;
	private String password;
	
	public Account() {
		
	}

	public Account(int id, int id_user, String name, String password) {
		super();
		this.id = id;
		this.id_user = id_user;
		this.name = name;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
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
		return "Account [id=" + id + ", id_user=" + id_user + ", name=" + name + ", password=" + password + "]";
	}
	
	
	
}
