package br.com.fiap.sprint4.model.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.sprint4.model.vo.Bike;
import dominio.repositorios.CadastrosDeBikes;





public class RepositorioDeBikes implements CadastrosDeBikes {
	
	private List<Bike> bikes = new ArrayList<>();
	

	@Override
	public void salvar(Bike novoBike) {
		bikes.add(novoBike);
		
	}

	
	@Override
	public Bike buscarPorNumeroDeSerie(String numeroDeSerie) {
		for (Bike bike : bikes) {
			if(bike.getNumeroDeSerie().toString().equals(numeroDeSerie)){
				return bike;
			}
		}
		return null;
	}
	

	@Override
	public List<Bike> listarTodos() {
		return bikes;
	}

}
