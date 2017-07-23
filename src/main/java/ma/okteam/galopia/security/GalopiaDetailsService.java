package ma.okteam.galopia.security;

import java.util.ArrayList;
import java.util.List;

import ma.okteam.galopia.persistance.model.User;
import ma.okteam.galopia.service.IUserService;
import ma.okteam.galopia.view.model.UserBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class GalopiaDetailsService implements UserDetailsService {

	@Autowired
	private IUserService<User, UserBean> userService;
	protected static final Logger LOGGER = LoggerFactory.getLogger(GalopiaDetailsService.class);

	@Override
	public UserDetails loadUserByUsername(final String username)
               throws UsernameNotFoundException {

		UserBean criteria = new UserBean();
		criteria.setLogin(username);
		UserBean user = userService.findById(username);
		
		if(user == null) {
			throw new UsernameNotFoundException("user with login : " + username+ " not found");
		}

		LOGGER.info("User " + user.getFullName() + " loaded");
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new GalopiaAutorisation("AUTHENTIFIED"));
		
		populateAuthorisations(user, authorities);
		return new GalopiaUserDetails(authorities, user);


	}
	
	private void populateAuthorisations(UserBean user, List<GrantedAuthority> authorities) {
		
		
	}

}
