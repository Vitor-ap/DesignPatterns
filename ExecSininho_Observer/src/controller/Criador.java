package controller;

import java.util.ArrayList;

public class Criador implements INotificacao, IObservavel {

	private ArrayList<Inscrito> inscrito;
	private String postagem;
	
	
	
	public Criador(ArrayList<Inscrito> inscrito) {
		this.inscrito = inscrito;

	}

	@Override
	public void notificaPostagem(String postagem) {
		((IObservador) inscrito).update(postagem);
		
	}

	@Override
	public void novaPostagem() {
		postagem = "Criador fez uma nova publicacao";
		System.out.println(postagem);
		for (int i = 0; i < inscrito.size(); i++)   {
			inscrito.get(i).novaPostagem();
		}
		
	}

}
