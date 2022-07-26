package model;

public class Login {
	private String login;
	private String password;
	private Token token;
	private TwoFactor twoFactor;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	public TwoFactor getTwoFactor() {
		return twoFactor;
	}

	public void setTwoFactor(TwoFactor twoFactor) {
		this.twoFactor = twoFactor;
	}

	@Override
	public String toString() {
		return "Login [login=" + login + ", password=" + password + ", token=" + token + ", twoFactor=" + twoFactor
				+ "]";
	}

	
}
