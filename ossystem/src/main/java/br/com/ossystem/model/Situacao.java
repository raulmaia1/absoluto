package br.com.ossystem.model;

public class Situacao {
	private EnumEstado enumEstado = EnumEstado.ABERTA;
	private String situacaoAtual = EnumSituacao.VERIFICACAO.getSituacao();
	
	
	public void setSituacaoAtual(String situacaoAtual) {
		this.situacaoAtual = situacaoAtual;
	}
	
	public EnumEstado getEstadoOS() {
		return enumEstado;
	}
	
	public String getSituacaoAtual() {
		return situacaoAtual;
	}
	
}
