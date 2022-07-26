package view;

import controller.ParOuImpar;
import controller.RandomClass;

public class Main {

	public static void main(String[] args) {
		
		ParOuImpar parOuImpar = new ParOuImpar();
		RandomClass randomClass = new RandomClass(parOuImpar);
		
		for (int i = 0; i <10; i++) {
			randomClass.numeros();
		}
		
		
	}
	
}
