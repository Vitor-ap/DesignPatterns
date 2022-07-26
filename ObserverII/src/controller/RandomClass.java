package controller;

import java.util.Random;

public class RandomClass implements INotificacao, IObservavel {

	private ParOuImpar parOuImpar;
	private int numero;
	
	public RandomClass(ParOuImpar parOuImpar) {
		this.parOuImpar = parOuImpar;
	}
	
	@Override
	public void notificaMudanca(int numero) {
		parOuImpar.update(numero);
		
	}

	@Override
	public void numeros() {
		var rand = new Random();
		numero = rand.nextInt(1001);
		notificaMudanca(numero);
		
		
	}

}
