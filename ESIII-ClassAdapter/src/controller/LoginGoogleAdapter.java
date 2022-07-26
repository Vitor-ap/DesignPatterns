package controller;

import model.Login;

public class LoginGoogleAdapter implements IFazerAutenticacao{

	LoginGoogle loginGoogle;

	public LoginGoogleAdapter(LoginGoogle loginGoogle) {
		this.loginGoogle = loginGoogle;
	}

	@Override
	public void fazerAutenticacao(Login login) {
		loginGoogle.fazerLogin(login.getLogin(), login.getPassword());
		if(login.getTwoFactor().getChaveConfirmacao()!= 0) {
			loginGoogle.confirmarSegundaEtapa(login.getTwoFactor().getChaveConfirmacao());
		}else {
			loginGoogle.enviarToken(login.getToken().getTokenLogin());
		}
	}
}
