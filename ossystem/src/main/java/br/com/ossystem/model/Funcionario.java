package br.com.ossystem.model;

public class Funcionario {
	private String nomeFuncionario = "Funcionario X";
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	

	public Funcionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
}
