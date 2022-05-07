package finalProject.CoffeeShop.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

public class Role {
	
	private int id;
	private String info;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(
			name="acc_role",
			joinColumns = @JoinColumn(name="id_role"),
			inverseJoinColumns = @JoinColumn(name="id_acc")
			)
	private List<Account> accountList;
	
	public Role() {
		
	}

	public Role(int id, String info) {
		super();
		this.id = id;
		this.info = info;
	}
	
	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
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
