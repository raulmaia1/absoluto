package br.com.ossystem.controller;

import br.com.absoluto.aplicacao.JanelaStage;
import br.com.absoluto.aplicacao.NomeJanela;
import javafx.application.Application;
import javafx.stage.Stage;

public class Teste extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		JanelaStage<?> janela = new JanelaStage<>();
		stage = janela.carregarStage(NomeJanela.FXMLOSSERVICOITENSPRINCIPAL, Inicio.class);
		stage.centerOnScreen();
		stage.show();
	}
}