package ma.okteam.galopia.persistance.dao;

import ma.okteam.galopia.persistance.model.Role;

public class RoleDAO extends BasicDAO<Role> {

	public RoleDAO() {
		setClazz(Role.class);
	}
}
