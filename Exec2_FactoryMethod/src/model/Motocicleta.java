package model;

public class Motocicleta extends Veiculo{
	private int cilindrada;
	private double deslocamento;
	private double valor_frete;
	
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public double getDeslocamento() {
		return deslocamento;
	}
	public void setDeslocamento(double deslocamento) {
		this.deslocamento = deslocamento;
	}
	public double getValor_frete() {
		return valor_frete;
	}
	public void setValor_frete(double valor_frete) {
		this.valor_frete = valor_frete;
	}
	
	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada + ", deslocamento=" + deslocamento + ", valor_frete="
				+ valor_frete + "]";
	}
	
	

}
