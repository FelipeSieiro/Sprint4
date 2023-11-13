package br.com.fiap.sprint4.model.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.sprint4.model.vo.Usuario;
import oracle.jdbc.pool.OracleDataSource;


public class GerenciadorUsuario {
	private String url ="jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
	public Connection conn;
		
		
	public GerenciadorUsuario() throws SQLException{
		OracleDataSource ods = new OracleDataSource();
		ods.setURL(url);
		ods.setUser(Credenciais.user);
		ods.setPassword(Credenciais.pwd);
		conn = ods.getConnection();
	}
	
	public boolean inserir(Usuario novoUsuario) {
        String sql = "INSERT INTO t_proprietario(id_proprietario, cpf, data_nasc, email, nome_cliente, endereco, telefone) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setInt(1, novoUsuario.getId()); 
            preparedStatement.setString(2, novoUsuario.getCpf());
            preparedStatement.setString(3, novoUsuario.getDataNascimento());
            preparedStatement.setString(4, novoUsuario.getEmail());
            preparedStatement.setString(5, novoUsuario.getNome());
            preparedStatement.setString(6, novoUsuario.getEndereco());
            preparedStatement.setString(7, novoUsuario.getTelefone());
            int rowsAffected = preparedStatement.executeUpdate(); 
            return rowsAffected > 0; 
        } catch (SQLException e) {
            System.err.println("ERRO ao cadastrar Usuário");
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluirUsuario(String cpf) {
        String sql = "DELETE FROM t_proprietario WHERE cpf = ?";

        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setString(1, cpf);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Return true if at least one row was deleted
        } catch (SQLException e) {
            System.err.println("ERRO ao excluir Usuário");
            e.printStackTrace();
            return false;
        }
    }
}