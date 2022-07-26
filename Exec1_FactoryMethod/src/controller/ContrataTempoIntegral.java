package controller;

import model.Funcionario;
import model.TempoIntegral;

public class ContrataTempoIntegral extends ContrataFuncionario {
	  @Override
	  public Funcionario inicializaFuncionario() {
	    TempoIntegral i = new TempoIntegral();
	    int id = (int) ((Math.random() * 1001) + 1000);
	    i.setId(id);
	    i.setNome("Vitor Alves");
	    i.setSalario(2600);
	    i.setBancoDeHoras(3);
	    return i;
	  }
	}