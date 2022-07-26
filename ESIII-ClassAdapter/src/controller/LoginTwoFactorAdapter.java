package controller;

import model.Login;

public class LoginTwoFactorAdapter implements IFazerAutenticacao {

	LoginTwoFactor twoFactor;
	
	public LoginTwoFactorAdapter(LoginTwoFactor twoFactor) {
		this.twoFactor = twoFactor;
	}
	
	public void fazerAutenticacao(Login login) {
		twoFactor.fazerLogin(login.getLogin(), login.getPassword());
		twoFactor.confirmarSegundaEtapa(login.getTwoFactor().getChaveConfirmacao());
	}
	
	
}
