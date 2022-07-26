package model;

public class Estagiario extends Funcionario {
	  private String instituicao;

	  public String getInstituicao() {
	    return this.instituicao;
	  }

	  public void setInstituicao(String instituicao) {
	    this.instituicao = instituicao;
	  }

	  @Override
	  public String toString() {
	    return "Estagiario ---> Instituicao parceira: " + instituicao;
	  }

	}