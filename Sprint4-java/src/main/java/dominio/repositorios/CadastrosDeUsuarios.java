package dominio.repositorios;

import java.util.List;

import br.com.fiap.sprint4.model.vo.Usuario;



public interface CadastrosDeUsuarios {
	public Usuario buscarPorCPF(String CPF);

	public void salvar(Usuario novoUsuario);

	public List<br.com.fiap.sprint4.model.vo.Usuario> listarTodos();
}
