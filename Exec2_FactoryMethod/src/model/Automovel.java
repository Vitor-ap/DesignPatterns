package model;

public class Automovel extends Veiculo{
	private int qtd_portas;
	private int ano;
	private double tempo_100km;
	private double deslocamento;
	private int passageiro;
	
	public int getQtd_portas() {
		return qtd_portas;
	}
	public void setQtd_portas(int qtd_portas) {
		this.qtd_portas = qtd_portas;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getTempo_100km() {
		return tempo_100km;
	}
	public void setTempo_100km(double tempo_100km) {
		this.tempo_100km = tempo_100km;
	}
	public double getDeslocamento() {
		return deslocamento;
	}
	public void setDeslocamento(double deslocamento) {
		this.deslocamento = deslocamento;
	}
	public int getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(int passageiro) {
		this.passageiro = passageiro;
	}
	@Override
	public String toString() {
		return "Automovel [qtd_portas=" + qtd_portas + ", ano=" + ano + ", tempo_100km=" + tempo_100km
				+ ", deslocamento=" + deslocamento + ", passageiro=" + passageiro + "]";
	}

	
}
