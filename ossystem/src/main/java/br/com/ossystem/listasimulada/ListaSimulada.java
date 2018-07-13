package br.com.ossystem.listasimulada;

import java.util.List;

import br.com.ossystem.model.Ordem;

public class ListaSimulada {
	
	public List<Ordem> listaOrdem() {	
		return new ListaSimuladaOrdem().listar();
	}
}
