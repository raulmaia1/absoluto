package br.com.ossystem.listasimulada;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.ossystem.model.Funcionario;
import br.com.ossystem.model.Servico;

public class ListaSimuladaServico {
	private List<Servico> lista = new ArrayList<>();
	
	public ListaSimuladaServico() {
		Servico servico = new Servico();
		servico.setCodigoServico("S01");
		servico.adicionaValor(new BigDecimal("40.00"));
		servico.setTecnicoResponsavel(new Funcionario());
		servico.setDescricaoServico("Descricao Servico 1");
		
		Servico servico2 = new Servico();
		servico2.setCodigoServico("S02");
		servico2.adicionaValor(new BigDecimal("100.00"));
		servico2.setTecnicoResponsavel(new Funcionario());
		servico2.setDescricaoServico("Descricao Servico 2");

		Servico servico3 = new Servico();
		servico3.setCodigoServico("S02");
		servico3.adicionaValor(new BigDecimal("10.00"));
		servico3.setTecnicoResponsavel(new Funcionario());
		servico3.setDescricaoServico("Descricao Servico 3");

		lista.add(servico);
		lista.add(servico3);
		lista.add(servico2);
		
	}
	
	public void adiciona(Servico servico) {
		lista.add(servico);
	}
	
	public List<Servico> listar() {
		return lista;
	}
	
}
