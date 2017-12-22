package br.com.pcs3643.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.pcs3643.models.Cliente;

public class ClienteDAO {
	
	private Connection connection;

	public ClienteDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public boolean create(Cliente cliente) throws SQLException
	{
		Statement statement = null;
		try {
			statement = connection.createStatement();
			return statement.execute("INSERT INTO cliente " +
					"(nome, cpf, email, endereco, telefone) " +
					"value ('" + cliente.getNome() + "', '" + cliente.getCPF() + "', '" +
					cliente.getEmail() + "', '" + cliente.getEndereco() + "', '" +
					cliente.getTelefone() + "')");
			
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
	
	public Cliente findByPrimaryKey(int id) throws SQLException {
		return new Cliente();
	}
	
	public List<Cliente> getAll() throws SQLException {
		Statement statement = null;
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM cliente");
			
			while(resultSet.next()){
				Cliente cliente = new Cliente();
				
				cliente.setId(resultSet.getLong("id"));
				cliente.setNome(resultSet.getString("nome"));
				cliente.setCPF(resultSet.getString("cpf"));
				cliente.setEmail(resultSet.getString("email"));
				cliente.setEndereco(resultSet.getString("endereco"));
				cliente.setTelefone(resultSet.getString("telefone"));
				
				clientes.add(cliente);
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
		
		return clientes;
	}
	
	public boolean update(Cliente cliente) throws SQLException {
		return false;
	}
	
	public boolean remove(int id) throws SQLException{
		return false;
	}

}

