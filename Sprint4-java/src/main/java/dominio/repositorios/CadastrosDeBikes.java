package dominio.repositorios;

import java.util.List;

import br.com.fiap.sprint4.model.vo.Bike;




public interface CadastrosDeBikes {
	
	public Bike buscarPorNumeroDeSerie(String numeroDeSerie);

	public void salvar(Bike novoBike);

	public List<Bike> listarTodos();
}
