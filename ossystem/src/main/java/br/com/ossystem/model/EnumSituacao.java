package br.com.ossystem.model;

public enum EnumSituacao {
	ENTREGUE {
		@Override
		public String getSituacao() {
			return "ENTREGUE";
		}
	}, VERIFICACAO {
		@Override
		public String getSituacao() {
			return "VERIFICACAO";
		}
	};
	
	public abstract String getSituacao();
		
}
