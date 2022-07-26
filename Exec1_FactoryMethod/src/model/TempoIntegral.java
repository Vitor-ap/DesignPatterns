package model;

public class TempoIntegral extends Funcionario {
	  private int bancoDeHoras;

	  public int getBancoDeHoras() {
	    return this.bancoDeHoras;
	  }

	  public void setBancoDeHoras(int bancoDeHoras) {
	    this.bancoDeHoras = bancoDeHoras;
	  }

	  @Override
	  public String toString() {
	    return "Banco de horas do funcionario Integral: " + bancoDeHoras + " horas.";
	  }
	}