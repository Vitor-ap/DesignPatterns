package controller;


public class Inscrito implements IObservador, INotificacao  {

	

	@Override
	public void novaPostagem() {

		
		System.out.println("Inscrito Recebeu a notificacao da postagem");
		
	}

	@Override
	public void update(String postagem) {
		novaPostagem();
		
	}

}
