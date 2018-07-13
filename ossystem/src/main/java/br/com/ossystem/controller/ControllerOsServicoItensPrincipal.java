package br.com.ossystem.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.absoluto.aplicacao.Janela;
import br.com.absoluto.aplicacao.JanelaStage;
import br.com.absoluto.aplicacao.NomeJanela;
import br.com.ossystem.gerador.GeradorAzulejoServicoItens;
import br.com.ossystem.repositorio.RepositorioServico;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControllerOsServicoItensPrincipal implements Initializable, Janela {
	
	@FXML
	private VBox viewItens;
	
	@FXML
	private Button buttonAdiciona;
	
	@FXML
	private ContextMenu contextMenu;
	private Stage stage;
	private GeradorAzulejoServicoItens gerador = new GeradorAzulejoServicoItens();
	private RepositorioServico repositorio = new RepositorioServico();
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		viewItens.getChildren().addAll(gerador.gerar(repositorio.procura("")));
	}
	
	@FXML
	private void apertouAdicionar(MouseEvent event) {
        contextMenu.show(stage, event.getScreenX(), event.getScreenY());
	}
	
	@FXML
	private void apertouAbrirConsultaServico() {
		JanelaStage<ControllerOsServicoConsulta> janela = new JanelaStage<>();
		Stage stage = janela.carregarStage(NomeJanela.FXMLOSSERVICOCONSULTA, Inicio.class);
		stage.showAndWait();
		this.repositorio.adicionaServico(janela.getController().getSelecionado());
		this.atualizarTabela();
	}

	private void atualizarTabela() {
		viewItens.getChildren().clear();
		viewItens.getChildren().addAll(this.gerador.gerar(repositorio.procura("")));
	}
	
	@FXML
	private void apertouAbrirAdicionaServico(){
		JanelaStage<ControllerOsServico> janela = new JanelaStage<>();
		Stage stage = janela.carregarStage(NomeJanela.FXMLOSSERVICO, Inicio.class);
		stage.showAndWait();
		janela.getController().getServico().ifPresent(t ->{
			System.out.println("Ok");
			this.repositorio.adicionaServico(t);
		});
		this.atualizarTabela();

	}
	
	@Override
	public void alteraStage(Stage stage) {	
		this.stage = stage;
	}
}
