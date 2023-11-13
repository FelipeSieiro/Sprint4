package br.com.fiap.sprint4.model.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.sprint4.model.vo.Usuario;
import dominio.repositorios.CadastrosDeUsuarios;



public class RepositorioDeUsuarios implements CadastrosDeUsuarios{
	private List<Usuario> Usuarios = new ArrayList<>();

	@Override
	public Usuario buscarPorCPF(String CPF) {
		for(Usuario user : Usuarios) {
			if(user.getCpf().toString().equals(CPF)){
				return user;
			}
		}
		return null;
	}

	@Override
	public void salvar(Usuario novoUsuario) {
		Usuarios.add(novoUsuario);
		
	}

	@Override
	public List<Usuario> listarTodos() {
		
		return Usuarios;
	}
	
	
}
