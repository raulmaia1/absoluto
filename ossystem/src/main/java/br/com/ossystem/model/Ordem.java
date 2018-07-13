package br.com.ossystem.model;

import br.com.ossystem.util.ZeroEsquerda;

public class Ordem {
	private Cliente cliente;
//	private List<Servico> servico = new ArrayList<>();
	private Produto produto;
	private String codigoOS, problema, detalhe;
	private Situacao situacao = new Situacao();
	
	//Setters	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setProblema(String problema) {
		this.problema = problema;		
	}

	public void setDetalhe(String detalhe) {
		this.detalhe = detalhe;		
	}
	
	public void setCodigoOS(Integer numeroOS) {
		this.codigoOS = new ZeroEsquerda().zeroEsquerda(Integer.toString(numeroOS));
	}
	
	public void mudarSituacao(String situacaoAtual) {
		situacao.setSituacaoAtual(situacaoAtual);
	}
	
	public void adicionaServico(Servico servico) {}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	//Getters
	public Cliente getCliente() {
		return cliente;
	}

	public Situacao getSituacao() {
		return situacao;
	}
		
	public String getCodigoOS() {
		return codigoOS;
	}
	
	public String getDetalhe() {
		return detalhe;
	}
	
	
	public String getProblema() {
		return problema;
	}
	
	public Produto getProduto() {
		return produto;
	}
}
