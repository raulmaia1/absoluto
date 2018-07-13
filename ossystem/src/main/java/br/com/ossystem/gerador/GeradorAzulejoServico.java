package br.com.ossystem.gerador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.ossystem.model.Servico;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

public class GeradorAzulejoServico {

	private Optional<Servico> servico = Optional.empty();
	
	public List<Node> gerar(List<Servico> servicos) {
		return gerar(servicos,400,100);
	}
	
	public List<Node> gerar(List<Servico> servicos,Integer largura, Integer altura) {
		List<Node> nodes = new ArrayList<>();

		for (Servico servico : servicos) {

			AnchorPane anchorPane = new AnchorPane();
			anchorPane.setMaxWidth(largura);
			anchorPane.setMaxHeight(altura);

			Label labelServico = new Label(servico.getDescricaoServico());
			labelServico.setLayoutX(GeradorAzulejo.LINHA_UM);
			labelServico.setLayoutY(GeradorAzulejo.COLUNA_UM);
			labelServico.getStyleClass().add("material-label-gigante-preto");

			Label labelValor = new Label(servico.getValor().toString());
			labelValor.setLayoutX(GeradorAzulejo.LINHA_UM);
			labelValor.setLayoutY(GeradorAzulejo.COLUNA_DOIS + 10);
			labelValor.getStyleClass().add("material-label-normal-preto");

			Rectangle rectangle = new Rectangle();
			rectangle.setWidth(largura);
			rectangle.setHeight(altura);
			rectangle.setArcHeight(5);
			rectangle.setArcWidth(5);
			rectangle.getStyleClass().add("material-card-pesquisa-branco");

			rectangle.setOnMouseClicked(value -> {
				this.servico = Optional.ofNullable(servico);
			});

			anchorPane.getChildren().addAll(rectangle, labelServico, labelValor);
			nodes.add(anchorPane);
		}

		return nodes;
	}

	public Optional<Servico> getSelecionado() {
		return servico;
	}
}
