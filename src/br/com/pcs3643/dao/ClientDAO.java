package br.com.pcs3643.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.pcs3643.models.Cliente;

public class ClientDAO extends GenericDAO 
{
	private Connection connection;
	
	public ClientDAO() throws SQLException {
		this.connection = GenericDAO.getConnection();		
	}
	
	public void create (Cliente cliente) throws SQLException
	{
		PreparedStatement pstm = this.connection.prepareStatement("INSERT INTO clientes (nome, cpf, email, endereco, telefone) "
				+ "values (?, ?, ?, ?, ?)");
		pstm.setString(1, cliente.getNome());
		pstm.setString(2, cliente.getCPF());
		pstm.setString(3, cliente.getEmail());
		pstm.setString(4, cliente.getEndereco());
		pstm.setString(5, cliente.getTelefone());
		
		pstm.executeUpdate();
		pstm.close();
	}
}
