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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

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
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_user")
	private User userAcc;
	
	public Account() {
		
	}

	public Account(int id, int id_user, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public User getUserAcc() {
		return userAcc;
	}

	public void setUserAcc(User userAcc) {
		this.userAcc = userAcc;
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
		return "Account [id=" + id + ", name=" + name + ", password=" + password + ", roleList=" + roleList
				+ ", userAcc=" + userAcc + "]";
	}
}
