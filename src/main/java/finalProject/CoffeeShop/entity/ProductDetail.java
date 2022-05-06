package finalProject.CoffeeShop.entity;

public class ProductDetail {
	private int id;
	private int cateId;
	private String name;
	private String brand;
	private String breed;
	private String weight;
	private int quantity;
	private String description;
	private String details;
	private double price;
	private String image;
	
	public ProductDetail() {
		
	}

	public ProductDetail(int id, int cateId, String name, String brand, String breed, String weight, int quantity,
			String description, String details, double price, String image) {
		super();
		this.id = id;
		this.cateId = cateId;
		this.name = name;
		this.brand = brand;
		this.breed = breed;
		this.weight = weight;
		this.quantity = quantity;
		this.description = description;
		this.details = details;
		this.price = price;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCateId() {
		return cateId;
	}

	public void setCateId(int cateId) {
		this.cateId = cateId;
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

	@Override
	public String toString() {
		return "ProductDetail [id=" + id + ", cateId=" + cateId + ", name=" + name + ", brand=" + brand + ", breed="
				+ breed + ", weight=" + weight + ", quantity=" + quantity + ", description=" + description
				+ ", details=" + details + ", price=" + price + ", image=" + image + "]";
	}
	
	
}
