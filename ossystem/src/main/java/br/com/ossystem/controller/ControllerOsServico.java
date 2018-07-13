package br.com.ossystem.controller;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import br.com.absoluto.aplicacao.Janela;
import br.com.ossystem.model.Funcionario;
import br.com.ossystem.model.Servico;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerOsServico implements Janela, Initializable {
	@FXML
	private TextField textCodigo, textDescricao, textTecnico, textValor;
	private Optional<Servico> servico = Optional.empty();
	private Stage stage;

	@Override
	public void initialize(URL location, ResourceBundle resources) {}

	@FXML
	private void apertouSalvar() {
		
		this.servico.ifPresent(servico ->{
			servico.getTecnicoResponsavel().setNomeFuncionario(textTecnico.getText());
			servico.adicionaValor(BigDecimal.valueOf(Double.valueOf(textValor.getText())));
		});
		
		
		this.servico =  Optional.of(this.servico.orElseGet(() ->{
			Servico servico = new Servico();
			servico.setCodigoServico(textCodigo.getText());
			servico.setDescricaoServico(textDescricao.getText());
			servico.setTecnicoResponsavel(new Funcionario(textTecnico.getText()));
			servico.adicionaValor(new BigDecimal(textValor.getText()));
			return servico;
		}));
			
		stage.close();
	}

	@Override
	public void alteraStage(Stage stage) {
		this.stage = stage;
	}

	public void adicionaServico(Servico selecionado) {
		this.servico = Optional.of(selecionado);
		textCodigo.setText(selecionado.getCodigoServico());
		textDescricao.setText(selecionado.getDescricaoServico());
		textTecnico.setText(selecionado.getTecnicoResponsavel().getNomeFuncionario());
		textValor.setText(selecionado.getValor().toString());
		
		textCodigo.setDisable(true);
		textDescricao.setDisable(true);
	}
		
	public Optional<Servico> getServico() {
		return servico;
	}
}
