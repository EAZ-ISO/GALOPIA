package ma.okteam.galopia.view.actions.user;

import ma.okteam.galopia.view.actions.AbstractAction;

public class LoginAction extends AbstractAction{

	public String gotoLogin() {
		return INPUT;
	}
	
	
	public String gotoRegister() {
		return INPUT;
	}
	
	public String error401() {
		return SUCCESS;
	}
}
