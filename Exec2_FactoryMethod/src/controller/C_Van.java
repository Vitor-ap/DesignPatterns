package controller;

import model.Van;
import model.Veiculo;

public class C_Van extends ControlerVeiculo {
	public Van movimentacaoVeiculo(Veiculo v) {
		Van van = new Van();
		van.setPlaca("EOV-7844");
		van.setMarca("Ducato");
		van.setModelo("2012");
		van.setCor("Preta");
		van.setVelocidademax(160);
		van.setParadas((int)(Math.random() * 3 ) + 9);
		van.setPassageiro((int)(Math.random() * 3 ) + 9);
		return van;
	}

}
