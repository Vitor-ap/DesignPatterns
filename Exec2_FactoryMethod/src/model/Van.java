package model;

public class Van extends Veiculo{
	private int passageiro;
	private int paradas;
	
	public int getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(int passageiro) {
		this.passageiro = passageiro;
	}
	public int getParadas() {
		return paradas;
	}
	public void setParadas(int paradas) {
		this.paradas = paradas;
	}
	@Override
	public String toString() {
		return "Van [passageiro=" + passageiro + ", paradas=" + paradas + "]";
	}
}
