package controller;

import model.Estagiario;
import model.Funcionario;

public class ContrataEstagiario extends ContrataFuncionario {
	  @Override
	  public Funcionario inicializaFuncionario() {
	    Estagiario e = new Estagiario();
	    int id = (int) ((Math.random() * 1001) + 1000);
	    e.setId(id);
	    e.setNome("Vitor Alves");
	    e.setSalario(1000);
	    e.setInstituicao("Uma Empresa Qualquer");
	    return e;
	  }
	}