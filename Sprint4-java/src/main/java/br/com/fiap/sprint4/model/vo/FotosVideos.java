package br.com.fiap.sprint4.model.vo;

public class FotosVideos {
	private boolean fotosAlteracoes;
	private boolean fotoFrente;
	private boolean fotoTras;
	private boolean fotoVistaDoCiclista;
	private boolean fotosDiagonais;
	private boolean video360Bike;
	private boolean videoAproximadoEDetalhado;
	
	
	public FotosVideos(boolean fotosAlteracoes, boolean fotoFrente, boolean fotoTras, boolean fotoVistaDoCiclista,
			boolean fotosDiagonais, boolean video360Bike, boolean videoAproximadoEDetalhado) {
	
		if (fotosAlteracoes == false) {
			throw new IllegalArgumentException("Foto Invalida");
		}
		if (fotoFrente == false) {
			throw new IllegalArgumentException("Foto Invalida");
		}
		if (fotoTras == false) {
			throw new IllegalArgumentException("Foto Invalida");
		}
		if (fotoVistaDoCiclista == false) {
			throw new IllegalArgumentException("Foto Invalida");
		}
		if (fotosDiagonais == false) {
			throw new IllegalArgumentException("Fotos Invalidas");
		}
		if (video360Bike == false) {
			throw new IllegalArgumentException("Video Invalido");
		}
		if (videoAproximadoEDetalhado == false) {
			throw new IllegalArgumentException("Video Invalido");
		}
		
		
		this.fotosAlteracoes = fotosAlteracoes;
		this.fotoFrente = fotoFrente;
		this.fotoTras = fotoTras;
		this.fotoVistaDoCiclista = fotoVistaDoCiclista;
		this.fotosDiagonais = fotosDiagonais;
		this.video360Bike = video360Bike;
		this.videoAproximadoEDetalhado = videoAproximadoEDetalhado;
	}


	public boolean isFotosAlteracoes() {
		return fotosAlteracoes;
	}


	public void setFotosAlteracoes(boolean fotosAlteracoes) {
		this.fotosAlteracoes = fotosAlteracoes;
	}


	public boolean isFotoFrente() {
		return fotoFrente;
	}


	public void setFotoFrente(boolean fotoFrente) {
		this.fotoFrente = fotoFrente;
	}


	public boolean isFotoTras() {
		return fotoTras;
	}


	public void setFotoTras(boolean fotoTras) {
		this.fotoTras = fotoTras;
	}


	public boolean isFotoVistaDoCiclista() {
		return fotoVistaDoCiclista;
	}


	public void setFotoVistaDoCiclista(boolean fotoVistaDoCiclista) {
		this.fotoVistaDoCiclista = fotoVistaDoCiclista;
	}


	public boolean isFotosDiagonais() {
		return fotosDiagonais;
	}


	public void setFotosDiagonais(boolean fotosDiagonais) {
		this.fotosDiagonais = fotosDiagonais;
	}


	public boolean isVideo360Bike() {
		return video360Bike;
	}


	public void setVideo360Bike(boolean video360Bike) {
		this.video360Bike = video360Bike;
	}


	public boolean isVideoAproximadoEDetalhado() {
		return videoAproximadoEDetalhado;
	}


	public void setVideoAproximadoEDetalhado(boolean videoAproximadoEDetalhado) {
		this.videoAproximadoEDetalhado = videoAproximadoEDetalhado;
	}
	
	
	
}
