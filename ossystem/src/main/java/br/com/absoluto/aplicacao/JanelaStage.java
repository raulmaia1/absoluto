package br.com.absoluto.aplicacao;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JanelaStage<T> {
	private T controller;
	
	public Stage carregarStage(NomeJanela nomeJanela, Class<?> classe) {
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(classe.getResource(nomeJanela.getNome()));
		Stage stage = new Stage();
		BorderPane borderPane;
		try {
			borderPane = fxmlLoader.load();
			Scene scene = new Scene(borderPane);
			stage.setScene(scene);
			controller = fxmlLoader.getController();
			((Janela) fxmlLoader.getController()).alteraStage(stage);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stage;
	}

	public Pane carregarPane(NomeJanela nomeJanela,Class<?> classe) {
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(classe.getResource(nomeJanela.getNome()));
		Pane pane = new Pane();
		try {
			pane = fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pane;
	}

	public T getController() {
		return controller;
	}
}
