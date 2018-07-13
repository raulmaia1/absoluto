package br.com.ossystem.builder;

import br.com.ossystem.model.Cliente;
import br.com.ossystem.model.Ordem;
import br.com.ossystem.model.Produto;

public class OrdemBuilder {

	private Cliente cliente;
	private Produto produto;
	private String problema;
	private String detalhe;

	public OrdemBuilder adicionaCliente(Cliente cliente) {
		this.cliente = cliente;
		return this;
	}

	public OrdemBuilder adicionaProduto(Produto produto) {
		this.produto = produto;
		return this;
	}

	public OrdemBuilder adicionaProblema(String problema) {
		this.problema = problema;
		return this;
	}

	public OrdemBuilder adicionaDetalhe(String detalhe) {
		this.detalhe = detalhe;
		return this;
	}

	public Ordem criar() {
		Ordem ordem = new Ordem();
		
		ordem.setCliente(cliente);
		ordem.setProduto(produto);
		ordem.setProblema(problema);
		ordem.setDetalhe(detalhe);
		
		return ordem;
	}

}
