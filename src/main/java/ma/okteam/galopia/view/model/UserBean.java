package ma.okteam.galopia.view.model;

// Generated 1 juil. 2017 23:13:12 by Hibernate Tools 4.0.0

import java.util.ArrayList;
import java.util.List;

public class UserBean extends OwaspBean<String> implements java.io.Serializable {

	private AdherentBean adherent;
	private String password;
	private Boolean active;
	private List<RoleBean> roles = new ArrayList<RoleBean>(0);

	public UserBean() {
	}

	public UserBean(String login) {
		this.id = login;
	}

	public UserBean(String login, AdherentBean adherent, String password,
			Boolean active, List<RoleBean> roles) {
		this.id = login;
		this.adherent = adherent;
		this.password = password;
		this.active = active;
		this.roles = roles;
	}

	public String getLogin() {
		return this.id;
	}

	public void setLogin(String login) {
		this.id = login;
	}

	public AdherentBean getAdherent() {
		return this.adherent;
	}

	public void setAdherent(AdherentBean adherent) {
		this.adherent = adherent;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<RoleBean> getRoles() {
		return this.roles;
	}

	public void setRoles(List<RoleBean> roles) {
		this.roles = roles;
	}
	
	public String getFullName() {
		return adherent != null ? adherent.getNom().concat(" ").concat(adherent.getPrenom()) : null;
	}

}
