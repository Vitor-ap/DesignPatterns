package model;

public class TempoParcial extends Funcionario {
	  private int horaEntrada;
	  private int horaSaida;

	  public int getHoraEntrada() {
	    return this.horaEntrada;
	  }

	  public void setHoraEntrada(int horaEntrada) {
	    this.horaEntrada = horaEntrada;
	  }

	  public int getHoraSaida() {
	    return this.horaSaida;
	  }

	  public void setHoraSaida(int horaSaida) {
	    this.horaSaida = horaSaida;
	  }

	  @Override
	  public String toString() {
	    return "Funcionario Tempo Parcial ----> Entrada as " + horaEntrada + " e Saida as " + horaSaida + " horas.";
	  }
	}