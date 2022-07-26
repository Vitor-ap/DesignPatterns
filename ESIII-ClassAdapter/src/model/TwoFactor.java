package model;

public class TwoFactor {
	private int chaveConfirmacao;

	public int getChaveConfirmacao() {
		return chaveConfirmacao;
	}

	public void setChaveConfirmacao(int chaveConfirmacao) {
		this.chaveConfirmacao = chaveConfirmacao;
	}

	@Override
	public String toString() {
		return "TwoFactor [chaveConfirmacao=" + chaveConfirmacao + "]";
	}

		
}
