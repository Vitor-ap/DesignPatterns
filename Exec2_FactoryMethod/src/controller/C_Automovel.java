package controller;

import model.Veiculo;
import model.Automovel;

public class C_Automovel extends ControlerVeiculo{
	public Automovel movimentacaoVeiculo(Veiculo v) {
		Automovel automovel = new Automovel();
		automovel.setPlaca("ABC-1234");
		automovel.setMarca("Volkswagen");
		automovel.setModelo("SANTANA");
		automovel.setCor("Vermelho");
		automovel.setVelocidademax(200);
		automovel.setQtd_portas((int)(Math.random() * 2 ) + 3);
		automovel.setTempo_100km((Math.random() * 20 ) + 10);
		automovel.setDeslocamento((Math.random() * 600 ) + 50);
		automovel.setPassageiro(((int)(Math.random() * 3 ) + 1));
		automovel.setAno(1986);
		return automovel;
	}

}
