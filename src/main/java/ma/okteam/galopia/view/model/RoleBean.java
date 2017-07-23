package ma.okteam.galopia.view.model;


import java.util.ArrayList;
import java.util.List;

public class RoleBean extends OwaspBean<Integer> implements java.io.Serializable {

	private String role;
	private List<UserBean> users = new ArrayList<UserBean>(0);

	public RoleBean() {
	}

	public RoleBean(String role, List<UserBean> users) {
		this.role = role;
		this.users = users;
	}


	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<UserBean> getUsers() {
		return this.users;
	}

	public void setUsers(List<UserBean> users) {
		this.users = users;
	}

}
