package ma.okteam.galopia.service;

import java.util.Set;

import ma.okteam.galopia.view.model.RoleBean;
import ma.okteam.galopia.view.model.UserBean;

public interface IUserService<T, U> extends IBasicDAOService<T, U> {

	public void activateUser(String login);
	
	public void desactivateUser(UserBean user);
	
	public void addRoles(UserBean user, Set<RoleBean> roles);
	
}
