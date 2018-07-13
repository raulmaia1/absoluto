package br.com.ossystem.gerador;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class GeradorAzulejoPresets {


	public List<Node> gerar(String busca) {
		List<Node> nodes = new ArrayList<Node>();

//		RepositorioPresetsOrdem repositorioPresetsOrdem = new RepositorioPresetsOrdem();

//		List<PresetsOrdem> list = repositorioPresetsOrdem.procura(busca);

		for (int i = 0; i < 5; i++) {
			Pane anchorPane = new Pane();
			anchorPane.setMaxWidth(GeradorAzulejo.LARGURA);
			anchorPane.setMaxHeight(GeradorAzulejo.ALTURA);

			Label field1 = new Label("Preset : ");
			field1.setLayoutY(GeradorAzulejo.COLUNA_UM);
			field1.setLayoutX(GeradorAzulejo.LINHA_UM);
			field1.getStyleClass().add("label-azulejo");

			Label field2 = new Label("HP " + String.valueOf(i));
			field2.setLayoutY(GeradorAzulejo.COLUNA_UM);
			field2.setLayoutX(GeradorAzulejo.LINHA_DOIS);
			field2.getStyleClass().add("label-azulejo");

			Label field4 = new Label(" Nome");
			field4.setLayoutY(GeradorAzulejo.COLUNA_DOIS);
			field4.setLayoutX(GeradorAzulejo.LINHA_UM);
			field4.getStyleClass().add("label-azulejo");

			Label field5 = new Label("Valor :");
			field5.setLayoutY(GeradorAzulejo.COLUNA_TRES);
			field5.setLayoutX(GeradorAzulejo.LINHA_UM);
			field5.getStyleClass().add("label-azulejo");

			Label field6 = new Label(String.valueOf(i) + 10);
			field6.setLayoutY(GeradorAzulejo.COLUNA_TRES);
			field6.setLayoutX(GeradorAzulejo.LINHA_DOIS);
			field6.getStyleClass().add("label-azulejo");

			Rectangle rectangle = new Rectangle();
			rectangle.setWidth(GeradorAzulejo.LARGURA);
			rectangle.setHeight(GeradorAzulejo.ALTURA);
			rectangle.setArcHeight(5);
			rectangle.setArcWidth(5);
			rectangle.getStyleClass().add("azulejo-presets");
			
			rectangle.setOnMouseClicked((value) ->{
			});
			
			anchorPane.getChildren().addAll(rectangle, field1, field2, field4, field5, field6);

			nodes.add(anchorPane);

		}
		return nodes;
	}
}
