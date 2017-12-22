package br.com.pcs3643.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.pcs3643.models.Cliente;
import br.com.pcs3643.models.Peca;

public class PecaDAO {
	
	private Connection connection;
	
	public PecaDAO() {
		 this.connection = new ConnectionFactory().getConnection();
	}
	
	public boolean create(Peca peca) throws SQLException
	{
		Statement statement = null;
		try {
			statement = connection.createStatement();
			return statement.execute("INSERT INTO peca " +
					"(nome, preco) " +
					"value ('" + peca.getNome() + "', '" + peca.getPreco() + "')");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			if (statement != null) {
				statement.close();
			}

			if (connection != null) {
				connection.close();
			}
		}
		return false;
	}
	
	public List<Peca> getAll() throws SQLException {
		Statement statement = null;
		List<Peca> pecas = new ArrayList<Peca>();
		
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM peca ");
			
			while(resultSet.next()){
				Peca peca = new Peca();
				
				peca.setId(resultSet.getInt("id"));
				peca.setNome(resultSet.getString("nome"));
				peca.setPreco(resultSet.getBigDecimal("preco"));
				peca.setDescricao(resultSet.getString("descricao"));
				peca.setTipoPeca(resultSet.getString("tipo_peca"));
				
				pecas.add(peca);
			}
			
			resultSet.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			if (statement != null) {
				statement.close();
			}

			if (connection != null) {
				connection.close();
			}
		}
		
		return pecas;
	}

}
