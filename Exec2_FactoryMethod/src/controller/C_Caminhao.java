package controller;

import model.Caminhao;
import model.Veiculo;

public class C_Caminhao extends ControlerVeiculo{
	public Caminhao movimentacaoVeiculo(Veiculo v) {
		Caminhao caminhao = new Caminhao();
		caminhao.setPlaca("MRX-5777");
		caminhao.setMarca("MERCEDES-BENZ");
		caminhao.setModelo("1718");
		caminhao.setCor("Branco");
		caminhao.setVelocidademax(120);
		caminhao.setCarga_max((Math.random() * 2000 ) + 1000);
		caminhao.setDeslocamento((Math.random() * 3000 ) + 500);
		caminhao.setValor_frete((Math.random() * 3000 ) + 2000);
		return caminhao;
	}

}
