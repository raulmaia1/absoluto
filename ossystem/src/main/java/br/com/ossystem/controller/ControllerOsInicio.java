package br.com.ossystem.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.absoluto.aplicacao.Janela;
import br.com.absoluto.aplicacao.JanelaStage;
import br.com.absoluto.aplicacao.NomeJanela;
import br.com.ossystem.gerador.GeradorAzulejo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ControllerOsInicio implements Initializable, Janela {
	
	@FXML
	private FlowPane viewBusca;
		
	@Override
	public void initialize(URL location, ResourceBundle resources) {}

	@Override
	public void alteraStage(Stage stage) {}
	
	@FXML
	private void pressionaBusca(KeyEvent event) {
		if(event.getCode().equals(KeyCode.ENTER)){	
			viewBusca.getChildren().clear();
			viewBusca.getChildren().addAll(new GeradorAzulejo().gerarAzulejoPresets(""));	
		}
	}
	
	@FXML
	private void pressionaAbrirCliente() {

	}
	
	@FXML
	private void pressionaAbrirProduto() {

	}
	
	@FXML
	private void pressionaAbrirNovaOrdem() {
		JanelaStage<ControllerOSPrincipal> janela  = new JanelaStage<>();
		janela.carregarStage(NomeJanela.FXMLOSPRINCIPAL, Inicio.class).show();
	}
	
	
}
