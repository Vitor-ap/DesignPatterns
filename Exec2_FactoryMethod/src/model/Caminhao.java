package model;

public class Caminhao extends Veiculo{
	private int qtd_eixos;
	private double carga_max;
	private double deslocamento;
	private double valor_frete;
	public int getQtd_eixos() {
		return qtd_eixos;
	}
	public void setQtd_eixos(int qtd_eixos) {
		this.qtd_eixos = qtd_eixos;
	}
	public double getCarga_max() {
		return carga_max;
	}
	public void setCarga_max(double carga_max) {
		this.carga_max = carga_max;
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
		return "Caminhao [qtd_eixos=" + qtd_eixos + ", carga_max=" + carga_max + ", deslocamento=" + deslocamento
				+ ", valor_frete=" + valor_frete + "]";
	}

}
