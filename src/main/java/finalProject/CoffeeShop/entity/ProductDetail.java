package finalProject.CoffeeShop.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product_detail")
public class ProductDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;	
	
	@Column(name="name")
	private String name;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="breed")
	private String breed;
	
	@Column(name="weight")
	private String weight;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="description")
	private String description;
	
	@Column(name="details")
	private String details;
	
	@Column(name="price")
	private double price;
	
	@Column(name="image")
	private String image;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(
			name="review",
			joinColumns = @JoinColumn(name= "id_product", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name="id_user", referencedColumnName = "id")
			)
	private List<User> userList;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="id_cate")
	private Category category;
	
	public ProductDetail() {
		
	}
	
	

	public ProductDetail(String name, String brand, String breed, String weight, int quantity, String description,
			String details, double price, String image, List<User> userList, List<User> userListCart,
			Category category) {
		super();
		this.name = name;
		this.brand = brand;
		this.breed = breed;
		this.weight = weight;
		this.quantity = quantity;
		this.description = description;
		this.details = details;
		this.price = price;
		this.image = image;
		this.userList = userList;
		this.category = category;
	}



	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
}
