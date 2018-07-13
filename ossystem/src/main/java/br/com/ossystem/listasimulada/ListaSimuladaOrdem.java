package br.com.ossystem.listasimulada;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.ossystem.model.Cliente;
import br.com.ossystem.model.Ordem;
import br.com.ossystem.model.Produto;

public class ListaSimuladaOrdem {
	private Map<String,Ordem> lista = new HashMap<>();

	public ListaSimuladaOrdem() {
		Ordem ordem = new Ordem();
		ordem.setCliente(new Cliente("Eduardo Raul"));
		ordem.setProduto(new Produto("Computador"));
		ordem.setDetalhe("Detalhe");
		ordem.setProblema("Problema");
		adiciona(ordem);
	}
	
	public List<Ordem> listar() {
		List<Ordem> list = new ArrayList<>();
		list.addAll(lista.values());
		return list;
	}
	
	public void adiciona(Ordem ordem) {
		ordem.setCodigoOS(lista.size()+1);
		lista.put(ordem.getCodigoOS(),ordem);
	}

	public Integer tamanho() {
		return lista.size();
	}

	public List<Ordem> procura(String busca) {
		List<Ordem> lista = new ArrayList<>();
		lista.forEach(ordem ->{
			if(ordem.getCliente().getNome().contains(busca)){
				lista.add(ordem);
			}
		});
		
		return lista;
	}

	public void altera(Ordem ordem) {
		if (lista.containsKey(ordem.getCodigoOS())){
			lista.getOrDefault(ordem.getCodigoOS(), ordem);
		}
	}
	
	
}
