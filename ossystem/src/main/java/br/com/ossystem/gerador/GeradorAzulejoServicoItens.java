package br.com.ossystem.gerador;

import java.util.ArrayList;
import java.util.List;

import br.com.ossystem.model.Servico;
import javafx.scene.Node;

public class GeradorAzulejoServicoItens {

	public List<Node> gerar(List<Servico> list) {
		List<Node> nodes = new ArrayList<>();
			
		List<Node> gerar1 = new GeradorAzulejoServico().gerar(list,600, 70);
		List<Node> gerar2 = this.gerarAzulejoProduto(list);
		
		nodes.addAll(gerar1);
		nodes.addAll(gerar2);
		return nodes;
		
	}

	private List<Node> gerarAzulejoProduto(List<Servico> list) {
		return new ArrayList<>();
	}
	
}
