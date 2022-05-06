package finalProject.CoffeeShop.entity;

public class Role {
	
	private int id;
	private String info;
	
	public Role() {
		
	}

	public Role(int id, String info) {
		super();
		this.id = id;
		this.info = info;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", info=" + info + "]";
	}
	
	
}
