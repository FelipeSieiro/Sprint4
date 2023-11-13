package br.com.fiap.sprint4.model.vo;

public class NumeroDeSerie {
private String numeroDeSerie;
	
	public NumeroDeSerie(String numeroDeSerie) {
		
		if (!isNumeroDeSerieValido(numeroDeSerie)) {
			throw new IllegalArgumentException("Numero de serie inválido");
		}
		
		this.numeroDeSerie = numeroDeSerie;
	}
	
	@Override
	public String toString() {
		return numeroDeSerie;
	}

	private boolean isNumeroDeSerieValido(String numeroDeSerie) {
		return numeroDeSerie != null && !numeroDeSerie.isBlank();
	}
}

