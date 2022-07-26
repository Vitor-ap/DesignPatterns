package view;

import java.util.ArrayList;

import controller.Criador;
import controller.Inscrito;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Inscrito> inscrito = new ArrayList<Inscrito>();
		for (int i = 0; i < 3; i++){
			inscrito.add(new Inscrito());
		}
		Criador criador = new Criador(inscrito);
		criador.novaPostagem();
				
		
	}
}
