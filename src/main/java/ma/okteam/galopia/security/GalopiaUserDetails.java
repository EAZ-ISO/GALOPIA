package ma.okteam.galopia.security;

import java.util.Collection;

import ma.okteam.galopia.view.model.UserBean;

import org.apache.commons.lang.BooleanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class GalopiaUserDetails implements UserDetails{

	private static final long serialVersionUID = -2851968635289086607L;
	protected static final Logger LOGGER = LoggerFactory.getLogger(GalopiaUserDetails.class);
	private UserBean user;
	private Collection<GrantedAuthority> authorities;
	
	public GalopiaUserDetails(Collection<GrantedAuthority> auth, UserBean user) {
		this.user = user;
		this.authorities = auth;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getLogin();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return BooleanUtils.isTrue(user.getActive());
	}
	
	public String getFullName() {
		return this.user.getFullName();
	}
}
