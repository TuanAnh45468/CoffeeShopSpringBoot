package finalProject.CoffeeShop.entity;

public class AccRole {
	private int accId;
	private int roleId;
	
	public AccRole() {
		
	}
	
	
	public AccRole(int accId, int roleId) {
		super();
		this.accId = accId;
		this.roleId = roleId;
	}


	public int getAccId() {
		return accId;
	}
	
	public void setAccId(int accId) {
		this.accId = accId;
	}
	
	public int getRoleId() {
		return roleId;
	}
	
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}


	@Override
	public String toString() {
		return "AccRole [accId=" + accId + ", roleId=" + roleId + "]";
	}
	
	
	
	
}
