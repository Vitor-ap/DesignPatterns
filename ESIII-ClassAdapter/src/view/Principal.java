package view;

import controller.IFazerAutenticacao;
import controller.LoginToken;
import controller.LoginTokenAdapter;
import controller.LoginTwoFactor;
import controller.LoginTwoFactorAdapter;
import model.Login;
import model.LoginBuilder;

public class Principal {

	public static void main(String[] args) {
		Login login = LoginBuilder.builder()
				.addUsuario("Fulano", "123")
				.addTwoFactor(123)
				.addToken(123)
				.get();
		
//		System.out.println(login.toString());
		
		LoginTwoFactor twoFactor = new LoginTwoFactor();
		LoginToken token = new LoginToken();
		IFazerAutenticacao fazerAutenticacaoTwoFactor = new LoginTwoFactorAdapter(twoFactor);
		IFazerAutenticacao fazerAutenticacaoToken = new LoginTokenAdapter(token);
		
		fazerAutenticacaoTwoFactor.fazerAutenticacao(login);
		
		fazerAutenticacaoToken.fazerAutenticacao(login);
	}

}
