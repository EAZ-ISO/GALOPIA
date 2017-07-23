package ma.okteam.galopia.view.actions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import ma.okteam.galopia.service.IRoleService;
import ma.okteam.galopia.service.IUserService;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
public abstract class AbstractAction extends ActionSupport implements RequestAware, SessionAware, ServletRequestAware {

	protected Map<String, Object> session;
	protected Map<String, Object> request;
	protected HttpServletRequest servletRequest;
	protected static final Logger LOGGER = LoggerFactory.getLogger(AbstractAction.class);
	
	@Autowired
	protected IUserService userService;
	@Autowired
	protected IRoleService roleService;
	
	
	
	public void setServletRequest(HttpServletRequest arg0) {
		this.servletRequest = arg0;
	}

	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
		
	}

	public void setRequest(Map<String, Object> arg0) {
		this.request = arg0;
		
	}

}
