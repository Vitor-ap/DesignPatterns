package controller;

import model.Login;

public class LoginTokenAdapter implements IFazerAutenticacao {

	LoginToken token;

	public LoginTokenAdapter(LoginToken token) {
		this.token = token;
	}

	public void fazerAutenticacao(Login login) {
		token.enviarToken(login.getToken().getTokenLogin());
	}
}
