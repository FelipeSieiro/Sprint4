package br.com.fiap.sprint4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.sprint4.model.vo.Bike;
import oracle.jdbc.datasource.impl.OracleDataSource;




public class GerenciadorBike {
	private String url ="jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
	public Connection conn;
		
		
	public GerenciadorBike () throws SQLException{
		OracleDataSource ods = new OracleDataSource();
		ods.setURL(url);
		ods.setUser(Credenciais.user);
		ods.setPassword(Credenciais.pwd);
		conn = ods.getConnection();
	}
	
	public boolean inserir(Bike novaBike) {
        String sql = "INSERT INTO t_bicicleta(cd_bike, modelo, marca, tipo, ano_de_fabr, cor, num_serie, frequencia_usodia, cd_proprietario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setInt(1, novaBike.getIdBike()); 
            preparedStatement.setString(2, novaBike.getModelo());
            preparedStatement.setString(3, novaBike.getMarca());
            preparedStatement.setString(4, novaBike.getTipo());
            preparedStatement.setInt(5, novaBike.getAno_de_fabr());
            preparedStatement.setString(6, novaBike.getCor());
            preparedStatement.setString(7, novaBike.getNumeroDeSerie());
            preparedStatement.setInt(8, novaBike.getFrequencia_usodia());
            preparedStatement.setInt(9, novaBike.getCdProprietario());
            int rowsAffected = preparedStatement.executeUpdate(); 
            return rowsAffected > 0; 
        } catch (SQLException e) {
            System.err.println("ERRO ao cadastrar Usuário");
            e.printStackTrace();
            return false;
        }
    }

	public boolean excluir(int idBike) {
	    String sql = "DELETE FROM t_bicicleta WHERE cd_bike = ?";

	    try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
	        preparedStatement.setInt(1, idBike);
	        int rowsAffected = preparedStatement.executeUpdate();
	        return rowsAffected > 0; // Return true if at least one row was deleted
	    } catch (SQLException e) {
	        System.err.println("ERRO ao excluir Bike");
	        e.printStackTrace();
	        return false;
	    }
	}
}
