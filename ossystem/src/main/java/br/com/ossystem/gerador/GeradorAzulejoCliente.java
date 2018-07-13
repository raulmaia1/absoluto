package br.com.ossystem.gerador;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

public class GeradorAzulejoCliente {

	public List<Node> gerar(String busca) {
		List<Node> nodes = new ArrayList<Node>();

//		RepositorioPresetsOrdem repositorioPresetsOrdem = new RepositorioPresetsOrdem();

//		List<PresetsOrdem> list = repositorioPresetsOrdem.procura(busca);

		for (int i = 0; i < 5; i++) {
			AnchorPane anchorPane = new AnchorPane();
			anchorPane.setMaxWidth(GeradorAzulejo.LARGURA);
			anchorPane.setMaxHeight(GeradorAzulejo.ALTURA);

			Label field2 = new Label("Nome");
			field2.setLayoutY(GeradorAzulejo.COLUNA_UM);
			field2.setLayoutX(GeradorAzulejo.LINHA_UM);
			field2.getStyleClass().add("label-azulejo");

			Label field4 = new Label("(99) 99999999");
			field4.setLayoutY(GeradorAzulejo.COLUNA_DOIS);
			field4.setLayoutX(GeradorAzulejo.LINHA_UM);
			field4.getStyleClass().add("label-azulejo");


			Rectangle rectangle = new Rectangle();
			rectangle.setWidth(GeradorAzulejo.LARGURA);
			rectangle.setHeight(GeradorAzulejo.ALTURA);
			rectangle.setArcHeight(5);
			rectangle.setArcWidth(5);
			rectangle.getStyleClass().add("azulejo-cliente");

			anchorPane.getChildren().addAll(rectangle, field2, field4);

			nodes.add(anchorPane);

		}
		return nodes;
	}
}
