package br.com.fiap.sprint4.model.vo;



public class Bike {
	private int idBike;
	private String modelo;
	private NumeroDeSerie numeroDeSerie ;
	private String notaFiscal;
	private int numerosDeModificacao;
	private String cor;
	private String marca;
	private String material;
	private int cdProprietario;
	private String tipo; 
	private int ano_de_fabr;
	private int frequencia_usodia;
	
	//construtor user
	public Bike(String modelo, String numeroDeSerie, String notaFiscal, String cor,
			String marca, String material,  String tipo, int ano_de_fabr, int frequencia_usodia, int numerosdeModificacao) {
		
	}
	
	//construtor sys
	public Bike(String modelo, NumeroDeSerie numeroDeSerie, String notaFiscal, int numerosDeModificacao, String cor,
			String marca, String material,  String tipo, int ano_de_fabr, int frequencia_usodia, int cdProprietario, int idBike) {
		
		if(marca == null || marca.equals("")){
			throw new IllegalArgumentException("Marca Inválida");
		}
		if(modelo == null || modelo.equals("")){
			throw new IllegalArgumentException("Modelo Inválido");
		}
		if(numeroDeSerie == null){
			throw new IllegalArgumentException("Numero de Série Inválido");
		}
		if(notaFiscal == null || notaFiscal.equals("")){
			throw new IllegalArgumentException("Nota Fiscal Inválida");
		}
		if(cor == null || cor.equals("")){
			throw new IllegalArgumentException("Cor Inválida");
		}
		if(material == null || material.equals("")){
			throw new IllegalArgumentException("Material Inválido");
		}
		
		this.modelo = modelo;
		this.numeroDeSerie = numeroDeSerie;
		this.notaFiscal = notaFiscal;
		this.numerosDeModificacao = numerosDeModificacao;
		this.cor = cor;
		this.marca = marca;
		this.material = material;
		this.tipo = tipo;
		this.ano_de_fabr = ano_de_fabr;
		this.frequencia_usodia = frequencia_usodia;
	}
	
	public String getNumeroDeSerie() {
			String number = numeroDeSerie.toString();
			return number;
		}
	
	public String toString() {
		return "Bike \n['Modelo': " + modelo + "\n Numero De Serie: " + numeroDeSerie + "\n NotaFiscal: " + notaFiscal + "\n Numero de modificações: " + numerosDeModificacao + "\n Cor: " + cor + "\n marca: " + marca + "\n Material: "+ material;
	}

	public int getIdBike() {
		return idBike;
	}

	public String getModelo() {
		return modelo;
	}

	public String getNotaFiscal() {
		return notaFiscal;
	}

	public int getNumerosDeModificacao() {
		return numerosDeModificacao;
	}

	public String getCor() {
		return cor;
	}

	public String getMarca() {
		return marca;
	}

	public String getMaterial() {
		return material;
	}

	public int getCdProprietario() {
		return cdProprietario;
	}

	public void setCdProprietario(int cdProprietario) {
		this.cdProprietario = cdProprietario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAno_de_fabr() {
		return ano_de_fabr;
	}

	public void setAno_de_fabr(int ano_de_fabr) {
		this.ano_de_fabr = ano_de_fabr;
	}

	public void setFrequencia_usodia(int frequencia_usodia) {
		this.frequencia_usodia = frequencia_usodia;
	}

	public int getFrequencia_usodia() {
		return frequencia_usodia;
	}
	 
	
}