package br.com.ossystem.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.absoluto.aplicacao.Janela;
import br.com.absoluto.aplicacao.JanelaStage;
import br.com.absoluto.aplicacao.NomeJanela;
import br.com.ossystem.gerador.GeradorAzulejoServico;
import br.com.ossystem.model.Servico;
import br.com.ossystem.repositorio.RepositorioServico;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ControllerOsServicoConsulta implements Janela, Initializable {
	@FXML
	private VBox vboxList;
	private Stage stage;
	private GeradorAzulejoServico gerador = new GeradorAzulejoServico();
	private Servico selecionado;
	
	private RepositorioServico repositorioServico = new RepositorioServico();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {		
		vboxList.getChildren().addAll(gerador.gerar(repositorioServico.procura("")));
		vboxList.setOnMouseClicked(s -> {
			JanelaStage<ControllerOsServico> janela = new JanelaStage<>();
			Stage stage1 = janela.carregarStage(NomeJanela.FXMLOSSERVICO, Inicio.class);
			ControllerOsServico controller = janela.getController();
			gerador.getSelecionado().ifPresent(selecionado -> {
				controller.adicionaServico(selecionado);
				this.selecionado = selecionado;
				stage1.showAndWait();
				stage.close();
			});
		});

	}

	@Override
	public void alteraStage(Stage stage) {
		stage.initStyle(StageStyle.UTILITY);
		stage.initModality(Modality.APPLICATION_MODAL);
		this.stage = stage;
	}

	@FXML
	public void apertarAbrirAdicionaServico() {
		JanelaStage<ControllerOsServico> janela = new JanelaStage<>();
		Stage stageServico = janela.carregarStage(NomeJanela.FXMLOSSERVICO, Inicio.class);

		ControllerOsServico controller = janela.getController();
		gerador.getSelecionado().ifPresent(value -> controller.adicionaServico(value));
		stageServico.showAndWait();
		this.stage.close();
	}
	
	public Servico getSelecionado() {
		return selecionado;
	}

}
