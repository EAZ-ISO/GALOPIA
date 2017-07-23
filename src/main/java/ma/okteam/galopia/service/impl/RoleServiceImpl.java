package ma.okteam.galopia.service.impl;

import ma.okteam.galopia.persistance.model.Role;
import ma.okteam.galopia.service.BasicDAOServiceImpl;
import ma.okteam.galopia.service.IRoleService;
import ma.okteam.galopia.view.model.RoleBean;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoleServiceImpl extends BasicDAOServiceImpl<Role, RoleBean> implements
		IRoleService<Role, RoleBean> {

}
