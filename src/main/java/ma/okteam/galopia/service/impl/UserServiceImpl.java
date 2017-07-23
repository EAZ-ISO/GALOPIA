package ma.okteam.galopia.service.impl;

import java.util.Set;

import ma.okteam.galopia.persistance.model.User;
import ma.okteam.galopia.service.BasicDAOServiceImpl;
import ma.okteam.galopia.service.IUserService;
import ma.okteam.galopia.view.model.RoleBean;
import ma.okteam.galopia.view.model.UserBean;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BasicDAOServiceImpl<User, UserBean> implements
		IUserService<User, UserBean> {

	public void activateUser(String login) {
		// TODO Auto-generated method stub
	}

	public void desactivateUser(UserBean user) {
		// TODO Auto-generated method stub

	}

	public void addRoles(UserBean user, Set<RoleBean> roles) {
		// TODO Auto-generated method stub

	}

}
