package finalProject.CoffeeShop.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="additional_info")
public class AdditionalInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="country")
	private String country;
	
	@Column(name="region")
	private String region;
	
	@Column(name="method")
	private String method;
	
	@Column(name="species")
	private String species;
	
	@Column(name="roast")
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
	


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_product")
	private ProductDetail productInfo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public ProductDetail getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(ProductDetail productInfo) {
		this.productInfo = productInfo;
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
