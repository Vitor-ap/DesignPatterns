package view;

import controller.C_Automovel;
import controller.C_Caminhao;
import controller.C_Motocicleta;
import controller.C_Van;
import model.Automovel;
import model.Caminhao;
import model.Motocicleta;
import model.Van;
import model.Veiculo;

public class Principal {
	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		C_Automovel controller_automovel = new C_Automovel();
		Automovel automovel = new Automovel();
		
		C_Caminhao controller_caminhao = new C_Caminhao();
		Caminhao caminhao = new Caminhao();
		
		C_Van controller_van = new C_Van();
		Van van = new Van();
		
		C_Motocicleta controller_motocicleta = new C_Motocicleta();
		Motocicleta motocicleta = new Motocicleta();
		
		automovel = controller_automovel.movimentacaoVeiculo(veiculo);
		caminhao = controller_caminhao.movimentacaoVeiculo(caminhao);
		van = controller_van.movimentacaoVeiculo(van);
		motocicleta = controller_motocicleta.movimentacaoVeiculo(motocicleta);
		
		System.out.println(automovel.toString());
		System.out.println(caminhao.toString());
		System.out.println(van.toString());
		System.out.println(motocicleta.toString());
	}

}
