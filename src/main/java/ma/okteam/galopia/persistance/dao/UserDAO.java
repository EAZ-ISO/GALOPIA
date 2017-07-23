package ma.okteam.galopia.persistance.dao;

import ma.okteam.galopia.persistance.model.User;

public class UserDAO extends BasicDAO<User>{

	public UserDAO() {
		setClazz(User.class);
	}
}
