package br.com.ossystem.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.absoluto.aplicacao.Janela;
import br.com.ossystem.util.ZeroEsquerda;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ControllerOSNumero implements Initializable,Janela {
	@FXML
	private Label labelNumero;
	private Stage stage;
	
	@FXML
	private void apertaOk() {
		stage.close();
	}
	
	public void alteraLabel(String label) {
		labelNumero.setText(new ZeroEsquerda().zeroEsquerda(label));
	}

	
	@Override
	public void alteraStage(Stage stage) {
		stage.initStyle(StageStyle.UNDECORATED);
		this.stage = stage;	
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {}

}
