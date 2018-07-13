package br.com.ossystem.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.absoluto.aplicacao.Janela;
import br.com.absoluto.aplicacao.JanelaStage;
import br.com.absoluto.aplicacao.NomeJanela;
import br.com.ossystem.builder.OrdemBuilder;
import br.com.ossystem.model.Cliente;
import br.com.ossystem.model.Ordem;
import br.com.ossystem.model.Produto;
import br.com.ossystem.repositorio.RepositorioOrdem;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ControllerOSPrincipal implements Initializable, Janela {
	@FXML
	private TextField textCliente, textProduto;
	@FXML
	private TextArea areaProblema, areaDetalhe;
	@FXML
	private BorderPane borderPrincipal;
	
	private RepositorioOrdem repositorio = new RepositorioOrdem();
	private Stage stage;

	@FXML
	private void acaoSalvar() {
		OrdemBuilder builder = new OrdemBuilder();

		Ordem ordem = builder.adicionaCliente(new Cliente(textCliente.getText())).adicionaProduto(new Produto(textProduto.getText()))
				.adicionaProblema(areaProblema.getText()).adicionaDetalhe(areaDetalhe.getText()).criar();
		
		JanelaStage<ControllerOSNumero> janela = new JanelaStage<>();
		Stage stage = janela.carregarStage(NomeJanela.FXMLNUMEROOS, Inicio.class);
		janela.getController().alteraLabel(repositorio.adicionaOrdem(ordem).toString());;
		borderPrincipal.setOpacity(0.2);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.showAndWait();
		this.stage.close();
	}

	@Override
	public void alteraStage(Stage stage) {
		stage.initStyle(StageStyle.UTILITY);
		this.stage = stage;
	}

	public void initialize(URL location, ResourceBundle resources) {}
}
