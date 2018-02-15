package br.com.pcs3643.dao;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.pcs3643.config.CryptWithMD5;
import br.com.pcs3643.models.Vendedor;

public class VendedorDAO {
	
	private Connection connection;
	
	public VendedorDAO() {
		this.connection = new ConnectionFactory().getConnection();		
	}

	public boolean create(Vendedor vendedor) throws SQLException, NoSuchAlgorithmException
	{
		Statement statement = null;
		try {
			statement = connection.createStatement();
			
			vendedor.setSenha(CryptWithMD5.cryptWithMD5(vendedor.getSenha()));
			
			return statement.execute("INSERT INTO vendedor " +
					"(nome, email, endereco, telefone, login, senha) " +
					"value ('" + vendedor.getNome() + "', '" +
					vendedor.getEmail() + "', '" + vendedor.getEndereco() + "', '" +
					vendedor.getTelefone() + "', '" + vendedor.getLogin() + "' , '" +
					vendedor.getSenha() + "')");
			
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
	
	public List<Vendedor> getAll() throws SQLException {
		Statement statement = null;
		List<Vendedor> vendedores = new ArrayList<Vendedor>();
		
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM vendedor ");
			
			while(resultSet.next()){
				Vendedor vendedor = new Vendedor();
				
				vendedor.setId(resultSet.getInt("id"));
				vendedor.setNome(resultSet.getString("nome"));
				vendedor.setEmail(resultSet.getString("email"));
				vendedor.setEndereco(resultSet.getString("endereco"));
				vendedor.setTelefone(resultSet.getString("telefone"));
				
				vendedores.add(vendedor);
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
		
		return vendedores;
	}
}
