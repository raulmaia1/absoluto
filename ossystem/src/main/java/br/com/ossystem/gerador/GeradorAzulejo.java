package br.com.ossystem.gerador;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Node;

public class GeradorAzulejo {

	protected static final int COLUNA_UM = 2;
	protected static final int COLUNA_DOIS = 30;
	protected static final double COLUNA_TRES = 60;

	protected static final int LINHA_UM = 5;
	protected static final double LINHA_DOIS = 90;
	
	protected static final int ALTURA = 150;
	protected static final int LARGURA = 200;

	public List<Node> gerarAzulejoPresets(String busca) {
		List<Node> node = new ArrayList<>();
		node.addAll(new GeradorAzulejoOrdem().gerar(busca));
		node.addAll(new GeradorAzulejoPresets().gerar(busca));
		node.addAll(new GeradorAzulejoCliente().gerar(busca));
		return node;
	}
}