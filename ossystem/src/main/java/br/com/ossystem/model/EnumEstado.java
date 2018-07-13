package br.com.ossystem.model;

public enum EnumEstado {
	 ABERTA {
		@Override
		boolean isFechada() {
			return false;
		}

		@Override
		String nomeEstado() {
			return "ABERTA";
		}
	},FECHADA {
		@Override
		boolean isFechada() {
			return true;
		}

		@Override
		String nomeEstado() {
			return "";
		}
	},ABERTAGARANTIA {
		@Override
		boolean isFechada() {
			return false;
		}

		@Override
		String nomeEstado() {
			return "ABERTA-GARANTIA";
		}
	},FECHADAGARANTIA {
		@Override
		boolean isFechada() {
			return true;
		}

		@Override
		String nomeEstado() {
			return "FECHADA-GARANTIA";
		}
	};
	
	abstract boolean isFechada();
	abstract String nomeEstado();
}
