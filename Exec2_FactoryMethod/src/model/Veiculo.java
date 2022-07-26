package model;

public class Veiculo {
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private int velocidademax;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getVelocidademax() {
		return velocidademax;
	}
	public void setVelocidademax(int velocidademax) {
		this.velocidademax = velocidademax;
	}

	public String toString() {
		return "Veiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor
				+ ", velocidademax=" + velocidademax + "]";
	}

}
