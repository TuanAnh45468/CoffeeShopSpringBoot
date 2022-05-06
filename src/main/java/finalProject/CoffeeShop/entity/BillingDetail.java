package finalProject.CoffeeShop.entity;

public class BillingDetail {
	
	private int id;
	private int listId;
	private String firstName;
	private String lastName;
	private String country;
	private String email;
	private String phoneNumber;
	private String address;
	
	public BillingDetail() {

	}

	public BillingDetail(int id, int listId, String firstName, String lastName, String country, String email,
			String phoneNumber, String address) {
		super();
		this.id = id;
		this.listId = listId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getListId() {
		return listId;
	}

	public void setListId(int listId) {
		this.listId = listId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "BillingDetail [id=" + id + ", listId=" + listId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", country=" + country + ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ "]";
	}
	
	
	
	
}
