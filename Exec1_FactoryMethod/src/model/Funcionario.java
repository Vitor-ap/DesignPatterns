package model;

public class Funcionario {
	  private int id;
	  private String nome;
	  private double salario;

	  public int getId() {
	    return this.id;
	  }

	  public void setId(int id) {
	    this.id = id;
	  }

	  public String getNome() {
	    return this.nome;
	  }

	  public void setNome(String nome) {
	    this.nome = nome;
	  }

	  public double getSalario() {
	    return this.salario;
	  }

	  public void setSalario(double salario) {
	    this.salario = salario;
	  }

	  @Override
	  public String toString() {
	    return "Funcionario [id=" + id + ", nome=" + nome + ", energia=" + salario + "]";
	  }
	}