package model;

public class Temporario extends Funcionario {
	  private int dia;
	  private int mes;
	  private int ano;

	  public int getDia() {
	    return this.dia;
	  }

	  public void setDia(int dia) {
	    this.dia = dia;
	  }

	  public int getMes() {
	    return this.mes;
	  }

	  public void setMes(int mes) {
	    this.mes = mes;
	  }

	  public int getAno() {
	    return this.ano;
	  }

	  public void setAno(int ano) {
	    this.ano = ano;
	  }

	  @Override
	  public String toString() {
	    return "Termino do Contrato do funcionario temporario: " + dia + "/" + mes + "/" + ano;
	  }
}