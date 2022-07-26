package model;

public class Token {
	private long tokenLogin;

	public long getTokenLogin() {
		return tokenLogin;
	}

	public void setTokenLogin(long tokenLogin) {
		this.tokenLogin = tokenLogin;
	}

	@Override
	public String toString() {
		return "Token [tokenLogin=" + tokenLogin + "]";
	}

	
}
