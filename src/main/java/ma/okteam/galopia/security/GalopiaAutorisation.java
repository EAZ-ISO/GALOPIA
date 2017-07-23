package ma.okteam.galopia.security;


import org.springframework.security.core.GrantedAuthority;

/**
 * Objet authorisation de spring security
 * 
 * Les authorisations sont préfixés par "ROLE_"
 * @author Omar HACHAMI
 *
 */
public class GalopiaAutorisation implements GrantedAuthority {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1814857641053275209L;


	private String role = "";


	private static final String ROLE = "ROLE_";
	
	/**
	 * @param role
	 */
	public GalopiaAutorisation(String role) {
		super();
		this.role = ROLE+role;
	}



	@Override
	public String getAuthority() {
		return role;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GalopiaAutorisation other = (GalopiaAutorisation) obj;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}
	
}

