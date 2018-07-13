package br.com.ossystem.repositorio;

import java.util.List;

import br.com.ossystem.listasimulada.ListaSimuladaOrdem;
import br.com.ossystem.model.Ordem;

public class RepositorioOrdem {
	private static ListaSimuladaOrdem listaSimuladaOrdem = new ListaSimuladaOrdem();
	
	public Integer adicionaOrdem(Ordem ordem) {
		listaSimuladaOrdem.adiciona(ordem);
		return listaSimuladaOrdem.tamanho();
	}

	public List<Ordem> procura(String busca) {
		return listaSimuladaOrdem.listar();
	}

	public void alteraOrdem(Ordem ordem) {
		listaSimuladaOrdem.altera(ordem);
	}

}
