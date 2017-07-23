package ma.okteam.galopia.view.model;

// Generated 1 juil. 2017 23:13:12 by Hibernate Tools 4.0.0

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;

public class AdherentBean extends OwaspBean<Integer> implements java.io.Serializable {

	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	private String codePostal;
	private String telephone;
	private Date dateNaissance;
	private List<UserBean> users = new ArrayList<UserBean>(0);

	public AdherentBean() {
	}

	public AdherentBean(String nom, String prenom, String email, String adresse,
			String codePostal, String telephone, Date dateNaissance,
			List<UserBean> users) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.telephone = telephone;
		this.dateNaissance = dateNaissance;
		this.users = users;
	}


	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return this.codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "DATE_NAISSANCE", length = 10)
	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public List<UserBean> getUsers() {
		return this.users;
	}

	public void setUsers(List<UserBean> users) {
		this.users = users;
	}

}
