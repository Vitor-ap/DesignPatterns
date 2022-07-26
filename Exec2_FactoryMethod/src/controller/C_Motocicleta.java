package controller;

import model.Motocicleta;
import model.Veiculo;

public class C_Motocicleta extends ControlerVeiculo{
	public Motocicleta movimentacaoVeiculo(Veiculo v) {
		Motocicleta motocicleta = new Motocicleta();
		motocicleta.setPlaca("EOV-7777");
		motocicleta.setMarca("CB 600F HORNET");
		motocicleta.setModelo("2012");
		motocicleta.setCor("Preta");
		motocicleta.setVelocidademax(250);
		motocicleta.setCilindrada(600);
		motocicleta.setDeslocamento((Math.random() * 80 ) + 20);
		motocicleta.setValor_frete((Math.random() * 80 ) + 30);
		return motocicleta;
	}

}
