package controller;

import model.Funcionario;
import model.TempoParcial;

public class ContrataTempoParcial extends ContrataFuncionario {
	  @Override
	  public Funcionario inicializaFuncionario() {
	    TempoParcial tp = new TempoParcial();
	    int id = (int) ((Math.random() * 1001) + 1000);
	    tp.setId(id);
	    tp.setNome("Vitor Alves");
	    tp.setSalario(1700);
	    tp.setHoraEntrada(10);
	    tp.setHoraSaida(14);
	    return tp;
	  }
	}