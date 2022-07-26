package controller;

import model.Veiculo;

public abstract class ControlerVeiculo {
	public void iniciomovimento(Veiculo v) {
		System.out.println("O Veiculo " + v.getModelo() + " Iniciou a movimentação");
	}

	public abstract Veiculo movimentacaoVeiculo(Veiculo v);
}
