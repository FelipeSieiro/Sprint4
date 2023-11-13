package br.com.fiap.sprint4.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.sprint4.model.bo.RepositorioDeBikes;
import br.com.fiap.sprint4.model.bo.RepositorioDeUsuarios;
import br.com.fiap.sprint4.model.dao.GerenciadorBike;
import br.com.fiap.sprint4.model.vo.Bike;
import br.com.fiap.sprint4.model.vo.NumeroDeSerie;
import br.com.fiap.sprint4.model.vo.Usuario;


public class CadastrarBike extends GerenciadorBike{
private RepositorioDeBikes repositorio;
private RepositorioDeUsuarios repositorio2;
	
	public CadastrarBike(RepositorioDeBikes repositorio, RepositorioDeUsuarios repositorio2) throws SQLException{
		this.repositorio = repositorio;
		this.repositorio2 = repositorio2;
	}
	
	
	public void cadastrarBike(String modelo, String numeroDeSerie, String notaFiscal, String cor, String marca, String material, String tipo, int ano_de_fabr, int frequencia_usodia, int numeroDeModificacoes) throws Exception {
		Bike bike = repositorio.buscarPorNumeroDeSerie(numeroDeSerie);
		
		if (bike != null) {
			throw new Exception(
					"Já existe uma Bike com esse numero de serie!");
		}
		
		List<Usuario> humanos = new ArrayList<>();
		humanos = repositorio2.listarTodos();
		
		int cdProprietario = humanos.size();
		
		List<Bike> bikesSis = new ArrayList<>();
		bikesSis = repositorio.listarTodos();
		
		int idBike = bikesSis.size();
		
		Bike novaBike = new Bike (modelo, new NumeroDeSerie(numeroDeSerie), notaFiscal, numeroDeModificacoes, cor, marca, material, tipo, ano_de_fabr, frequencia_usodia, cdProprietario, idBike);
		
		this.repositorio.salvar(novaBike);
	}
}
