package view;

import controller.ContrataEstagiario;
import controller.ContrataTempoIntegral;
import controller.ContrataTempoParcial;
import controller.ContrataTemporario;
import model.Funcionario;


public class Main {
	  public static void main(String[] args) {
	    ContrataTempoIntegral ti = new ContrataTempoIntegral();
	    ContrataTempoParcial tp = new ContrataTempoParcial();
	    ContrataTemporario t = new ContrataTemporario();
	    ContrataEstagiario e = new ContrataEstagiario();

	    Funcionario funcionario;
	    int tipoFuncionario = 4;

	    switch (tipoFuncionario) {
	      case 1: {
	        funcionario = ti.inicializaFuncionario();
	        break;
	      }
	      case 2: {
	        funcionario = tp.inicializaFuncionario();
	        break;
	      }
	      case 3: {
	        funcionario = t.inicializaFuncionario();
	        break;
	      }
	      case 4: {
	        funcionario = e.inicializaFuncionario();
	        break;
	      }
	      default: {
	        funcionario = e.inicializaFuncionario();
	        break;
	      }
	    }

	    System.out.println(funcionario);
	  }
	}