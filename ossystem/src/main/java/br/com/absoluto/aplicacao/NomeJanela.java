package br.com.absoluto.aplicacao;

public enum NomeJanela {
	FXMLOSPRINCIPAL {
		@Override
		public String getNome() {
			return "FXMLOSPRINCIPAL.fxml";
		}
	
	}, FXMLNUMEROOS {
		@Override
		public String getNome() {
			return "FXMLNUMEROOS.fxml";
		}
	}, FXMLOSINICIO {
		@Override
		public String getNome() {
			return "FXMLOSINICIO.fxml";
		}
	}, FXMLOSSITUACAO {
		@Override
		public String getNome() {
			return "FXMLOSSITUACAO.fxml";
		}
	}, FXMLOSSERVICOCONSULTA {
		@Override
		public String getNome() {
			return "FXMLOSSERVICOCONSULTA.fxml";
		}
	}, FXMLOSSERVICO {
		@Override
		public String getNome() {
			return "FXMLOSSERVICO.fxml";
		}
	}, FXMLOSSERVICOITENSPRINCIPAL {
		@Override
		public String getNome() {
			return "FXMLOSSERVICOITENSPRINCIPAL.fxml";
		}
	};
	
	public abstract String getNome();
}
