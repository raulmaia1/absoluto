package br.com.ossystem.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.absoluto.aplicacao.Janela;
import br.com.absoluto.aplicacao.JanelaStage;
import br.com.absoluto.aplicacao.NomeJanela;
import br.com.ossystem.model.EnumEstado;
import br.com.ossystem.model.EnumSituacao;
import br.com.ossystem.model.Ordem;
import br.com.ossystem.repositorio.RepositorioOrdem;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ControllerOsSituacao implements Initializable, Janela {
	
	@FXML
	private TextField textCodigo;
	@FXML
	private ComboBox<EnumEstado> comboEstado;
	@FXML
	private ComboBox<String> comboTipo;
	@FXML
	private Button buttonFinalizar,buttonServico;
	
	private Ordem ordem;
	private Stage stage;
	
	private RepositorioOrdem repositorioOrdem = new RepositorioOrdem();
	
	@FXML
	private void apertarSalvar() {
		ordem.mudarSituacao(comboTipo.getValue());
		repositorioOrdem.alteraOrdem(this.ordem);
		stage.close();
	}
	
	@FXML
	private void apertarAbrirServico() {
		JanelaStage<ControllerOSNumero> janela = new JanelaStage<>();
		janela.carregarStage(NomeJanela.FXMLOSSERVICOCONSULTA, Inicio.class).show();
		
	}

	public void alteraOrdem(Ordem ordem) {
		textCodigo.setText(ordem.getCodigoOS());
		comboEstado.setValue(ordem.getSituacao().getEstadoOS());	
		comboTipo.setValue(ordem.getSituacao().getSituacaoAtual());
		this.ordem = ordem;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		comboEstado.setItems(FXCollections.observableArrayList(EnumEstado.ABERTA
				,EnumEstado.FECHADA
				,EnumEstado.ABERTAGARANTIA
				,EnumEstado.FECHADAGARANTIA));
		
		comboTipo.setItems(FXCollections.observableArrayList(EnumSituacao.ENTREGUE.getSituacao()
				,EnumSituacao.VERIFICACAO.getSituacao()));
		
		buttonFinalizar.setTooltip(new Tooltip("Finalizar Ordem"));
		buttonServico.setTooltip(new Tooltip("Adicionar Serviços"));
	}

	@Override
	public void alteraStage(Stage stage) {
		stage.initStyle(StageStyle.UTILITY);
		stage.initModality(Modality.APPLICATION_MODAL);
		this.stage = stage;
	}
	
	
}
