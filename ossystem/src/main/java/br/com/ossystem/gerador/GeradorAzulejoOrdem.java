package br.com.ossystem.gerador;

import java.util.ArrayList;
import java.util.List;

import br.com.absoluto.aplicacao.JanelaStage;
import br.com.absoluto.aplicacao.NomeJanela;
import br.com.ossystem.controller.ControllerOsSituacao;
import br.com.ossystem.model.Ordem;
import br.com.ossystem.repositorio.RepositorioOrdem;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GeradorAzulejoOrdem {

	public List<Node> gerar(String busca) {
		List<Node> nodes = new ArrayList<Node>();

		RepositorioOrdem repositorioPresetsOrdem = new RepositorioOrdem();

		List<Ordem> list = repositorioPresetsOrdem.procura(busca);

		for (Ordem ordem : list) {

			AnchorPane anchorPane = new AnchorPane();
			anchorPane.setMaxWidth(GeradorAzulejo.LARGURA);
			anchorPane.setMaxHeight(GeradorAzulejo.ALTURA);
			
			Label field1 = new Label("Ordem  ");
			field1.setLayoutY(GeradorAzulejo.COLUNA_UM);
			field1.setLayoutX(GeradorAzulejo.LINHA_UM);
			field1.getStyleClass().add("label-azulejo");
			
			Label field2 = new Label(ordem.getCodigoOS());
			field2.setLayoutY(GeradorAzulejo.COLUNA_UM);
			field2.setLayoutX(GeradorAzulejo.LINHA_DOIS);
			field2.getStyleClass().add("label-azulejo");
						
			Label field4 = new Label(ordem.getCliente().getNome());
			field4.setLayoutY(GeradorAzulejo.COLUNA_DOIS);
			field4.setLayoutX(GeradorAzulejo.LINHA_UM);
			field4.getStyleClass().add("label-azulejo");

			Label field6 = new Label(ordem.getSituacao().getSituacaoAtual());
			field6.setLayoutY(GeradorAzulejo.COLUNA_TRES);
			field6.setLayoutX(GeradorAzulejo.LINHA_UM);
			field6.getStyleClass().add("label-azulejo");

			Rectangle rectangle = new Rectangle();
			rectangle.setWidth(GeradorAzulejo.LARGURA);
			rectangle.setHeight(GeradorAzulejo.ALTURA);
			rectangle.setArcHeight(10);
			rectangle.setArcWidth(10);
			rectangle.getStyleClass().add("azulejo-ordem");
			
			rectangle.setOnMouseClicked(value ->{
				JanelaStage<ControllerOsSituacao> janela = new JanelaStage<ControllerOsSituacao>();
				Stage stage = janela.carregarStage(NomeJanela.FXMLOSSITUACAO,ControllerOsSituacao.class);
				ControllerOsSituacao controller = janela.getController();
				controller.alteraOrdem(ordem);
				stage.show();
			});
			
			anchorPane.getChildren().addAll(rectangle,field1,  field2, field4, field6);

			nodes.add(anchorPane);

		}
		return nodes;
	}
}
