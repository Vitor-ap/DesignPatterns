package controller;

public class ParOuImpar implements IObservador, INotificacao {

	@Override
	public void numeros() {
		
		
	}

	@Override
	public void update(int numero) {
		if (numero % 2 == 0){
			System.out.println(numero + " - O numero é par");
		}
		else {
			System.out.println(numero + " - O numero é impar");
		}
	}

}
