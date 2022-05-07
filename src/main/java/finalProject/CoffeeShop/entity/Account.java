package finalProject.CoffeeShop.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="id_user")
	private  int userId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(
			name="acc_role",
			joinColumns = @JoinColumn(name="id_acc"),
			inverseJoinColumns = @JoinColumn(name="id_role")
			)
	private List<Role> roleList;
	
	public Account() {
		
	}

	public Account(int id, int id_user, String name, String password) {
		super();
		this.id = id;
		this.userId = id_user;
		this.name = name;
		this.password = password;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
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
