package finalProject.CoffeeShop.entity;

public class AdditionalInfo {
	
	private int id;
	private int productId;
	private String country;
	private String region;
	private String method;
	private String species;
	private String roast;
	
	public AdditionalInfo() {
		
	}
	
	

	public AdditionalInfo(int id, int productId, String country, String region, String method, String species,
			String roast) {
		super();
		this.id = id;
		this.productId = productId;
		this.country = country;
		this.region = region;
		this.method = method;
		this.species = species;
		this.roast = roast;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getRoast() {
		return roast;
	}

	public void setRoast(String roast) {
		this.roast = roast;
	}

	@Override
	public String toString() {
		return "AdditionalInfo [id=" + id + ", productId=" + productId + ", country=" + country + ", region=" + region
				+ ", method=" + method + ", species=" + species + ", roast=" + roast + "]";
	}
	
	
}
