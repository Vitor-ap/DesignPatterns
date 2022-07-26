package model;

public class LoginBuilder {
	Login login;
	Token token;
	TwoFactor twofactor;

	public LoginBuilder() {
		this.login = new Login();
		this.token = new Token();
		this.twofactor = new TwoFactor();
	}

	public static LoginBuilder builder() {
		return new LoginBuilder();
	}

	public LoginBuilder addUsuario(String login, String password) {
		this.login.setLogin(login);
		this.login.setPassword(password);
		return this;
	}

	public LoginBuilder addToken(long token) {
		this.token.setTokenLogin(token);
		return this;
	}

	public LoginBuilder addTwoFactor(int chaveConfirmacao) {
		this.twofactor.setChaveConfirmacao(chaveConfirmacao);
		return this;
	}
	
	public Login get() {
		this.login.setToken(token);
		this.login.setTwoFactor(twofactor);
		return login;
	}

}
