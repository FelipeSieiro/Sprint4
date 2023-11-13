package br.com.fiap.sprint4.controller;

import br.com.fiap.sprint4.model.vo.NumeroDeSerie;

public class BikeDTO {
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
		
		
		
		
		public int getIdBike() {
			return idBike;
		}
		public void setIdBike(int idBike) {
			this.idBike = idBike;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public NumeroDeSerie getNumeroDeSerie() {
			return numeroDeSerie;
		}
		public void setNumeroDeSerie(NumeroDeSerie numeroDeSerie) {
			this.numeroDeSerie = numeroDeSerie;
		}
		public String getNotaFiscal() {
			return notaFiscal;
		}
		public void setNotaFiscal(String notaFiscal) {
			this.notaFiscal = notaFiscal;
		}
		public int getNumerosDeModificacao() {
			return numerosDeModificacao;
		}
		public void setNumerosDeModificacao(int numerosDeModificacao) {
			this.numerosDeModificacao = numerosDeModificacao;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getMaterial() {
			return material;
		}
		public void setMaterial(String material) {
			this.material = material;
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
		public int getFrequencia_usodia() {
			return frequencia_usodia;
		}
		public void setFrequencia_usodia(int frequencia_usodia) {
			this.frequencia_usodia = frequencia_usodia;
		}
		
	
		public String toString() {
			return "Bike \n['Modelo': " + modelo  
					+ "\n Numero De Serie: " + numeroDeSerie 
					+ "\n NotaFiscal: " + notaFiscal 
					+ "\n Numero de modificações: " + numerosDeModificacao
					+ "\n Cor: " + cor 
					+ "\n marca: " + marca 
					+ "\n Material: "+ material;
		}
}
