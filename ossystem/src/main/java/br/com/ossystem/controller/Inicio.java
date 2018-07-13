package br.com.ossystem.controller;

import br.com.absoluto.aplicacao.JanelaStage;
import br.com.absoluto.aplicacao.NomeJanela;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Inicio extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		JanelaStage<?> janela = new JanelaStage<>();
		stage = janela.carregarStage(NomeJanela.FXMLOSINICIO, Inicio.class);
		stage.centerOnScreen();
		stage.initStyle(StageStyle.UNIFIED);
		stage.setMaximized(true);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}
