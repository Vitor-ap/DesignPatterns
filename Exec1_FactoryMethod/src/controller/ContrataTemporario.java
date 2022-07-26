package controller;

import model.Funcionario;
import model.Temporario;

public class ContrataTemporario extends ContrataFuncionario {
	  @Override
	  public Funcionario inicializaFuncionario() {
	    Temporario t = new Temporario();
	    int id = (int) ((Math.random() * 1001) + 1000);
	    t.setId(id);
	    t.setNome("Vitor Alves");
	    t.setSalario(2000);
	    t.setDia(25);
	    t.setMes(07);
	    t.setAno(2023);
	    return t;
	  }
	}