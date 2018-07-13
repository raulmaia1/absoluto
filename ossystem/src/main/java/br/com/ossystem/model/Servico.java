package br.com.ossystem.model;

import java.math.BigDecimal;

public class Servico {
	private String codigoServico;
	private Funcionario tecnicoResponsavel;
	private BigDecimal valor = new BigDecimal(0.0);
	private String descricaoServico;
	
	// Setters
	public void setTecnicoResponsavel(Funcionario tecnicoResponsavel) {
		this.tecnicoResponsavel = tecnicoResponsavel;
	}
	
	public void adicionaValor(BigDecimal bigDecimal) {
		valor = valor.add(bigDecimal);
	}
	 
	public void setCodigoServico(String codigoServico) {
		this.codigoServico = codigoServico;
	}
	
	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;		
	}
	
	//Getters
	public String getCodigoServico() {
		return codigoServico;
	}
		
	public Funcionario getTecnicoResponsavel() {
		return tecnicoResponsavel;
	}

	public String getDescricaoServico() {
		return descricaoServico;
	}
	
	public BigDecimal getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Servico [codigoServico=" + codigoServico + ", descricaoServico=" + descricaoServico + "]";
	}
	

}
