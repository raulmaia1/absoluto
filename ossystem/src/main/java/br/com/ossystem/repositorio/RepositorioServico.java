package br.com.ossystem.repositorio;

import java.util.List;

import br.com.ossystem.listasimulada.ListaSimuladaServico;
import br.com.ossystem.model.Servico;

public class RepositorioServico {
	private static ListaSimuladaServico lista = new ListaSimuladaServico();

	public List<Servico> procura(String busca) {
		return lista.listar();
	}
	
	public void adicionaServico(Servico servico){
		lista.adiciona(servico);
		System.out.println("ok");
	}
	
	
}
