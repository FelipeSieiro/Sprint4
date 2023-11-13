package br.com.fiap.sprint4.model.vo;

public class IA {
	private boolean veracidadeDasImagens;
	private boolean cruzamentoDasInfos;
	private boolean porcentagemDeCompatibilidade;
	
	
	public IA(boolean veracidadeDasImagens, boolean cruzamentoDasInfos, boolean porcentagemDeCompatibilidade) {
		
		if (veracidadeDasImagens == false) {
			throw new IllegalArgumentException("Fotos e Videos Invalidos");
		}
		if (cruzamentoDasInfos == false) {
			throw new IllegalArgumentException("Algo não esta sendo compativel com o que foi descrito!");
		}
		if (porcentagemDeCompatibilidade == false) {
			throw new IllegalArgumentException("Fotos e Vides não estão compativeis");
		}
		
		this.veracidadeDasImagens = veracidadeDasImagens;
		this.cruzamentoDasInfos = cruzamentoDasInfos;
		this.porcentagemDeCompatibilidade = porcentagemDeCompatibilidade;
	}
	
	public boolean isVeracidadeDasImagens() {
		return veracidadeDasImagens;
	}
	public void setVeracidadeDasImagens(boolean veracidadeDasImagens) {
		this.veracidadeDasImagens = veracidadeDasImagens;
	}
	public boolean isCruzamentoDasInfos() {
		return cruzamentoDasInfos;
	}
	public void setCruzamentoDasInfos(boolean cruzamentoDasInfos) {
		this.cruzamentoDasInfos = cruzamentoDasInfos;
	}
	public boolean isPorcentagemDeCompatibilidade() {
		return porcentagemDeCompatibilidade;
	}
	public void setPorcentagemDeCompatibilidade(boolean porcentagemDeCompatibilidade) {
		this.porcentagemDeCompatibilidade = porcentagemDeCompatibilidade;
	}
	
	
}
