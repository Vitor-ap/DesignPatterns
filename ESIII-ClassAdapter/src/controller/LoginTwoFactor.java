package controller;

public class LoginTwoFactor {
	public void fazerLogin(String nome, String senha) {
		System.out.println("Login: " + nome + " Senha:" + senha + "\nRealizado com sucesso");
	}

	public void confirmarSegundaEtapa(int chaveConfirmacao) {
		System.out.println("Codigo TwoFactor: " + chaveConfirmacao);
	}
}
