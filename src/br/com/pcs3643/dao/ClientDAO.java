package br.com.pcs3643.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.pcs3643.models.Cliente;

public class ClientDAO extends GenericDAO 
{
	private Connection connection;
	
	public ClientDAO() throws SQLException {
		this.connection = GenericDAO.getConnection();		
	}
	
	public Cliente create (Cliente cliente) throws SQLException
	{
		if (cliente.validate())
		{
			
			try (PreparedStatement pstm = this.connection.prepareStatement("INSERT INTO cliente (nome, cpf, email, endereco, telefone) "
					+ "values (?, ?, ?, ?, ?)"))
			{
				pstm.setString(1, cliente.getNome());
				pstm.setString(2, cliente.getCPF());
				pstm.setString(3, cliente.getEmail());
				pstm.setString(4, cliente.getEndereco());
				pstm.setString(5, cliente.getTelefone());
				
				pstm.executeUpdate();
			}
			
		}
		
		return cliente;
		
	}
	
	
	public Cliente read(int id) throws SQLException
	{
		Cliente cliente = new Cliente();
		
		try (
				PreparedStatement pstm = this.connection.prepareStatement("SELECT * FROM " + Cliente.class.getSimpleName()
				+ " WHERE id = ?");
				ResultSet rs = pstm.executeQuery()
			)
		{
			pstm.setInt(1, id);
			
			
			while(rs.next()){
				
				cliente.setId(rs.getLong("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCPF(rs.getString("cpf"));
				cliente.setEmail(rs.getString("email"));
				cliente.setEndereco(rs.getString("endereco"));
				cliente.setTelefone(rs.getString("telefone"));
			}
		}
		
		return cliente;
	}
	
	public List<Cliente> getAll () throws SQLException
	{
		List<Cliente> clientes = new ArrayList<>();
		
		try (
				PreparedStatement pstm = this.connection.prepareStatement("SELECT * FROM " + Cliente.class.getSimpleName());
				ResultSet rs = pstm.executeQuery()
			)
		{
			while(rs.next()){
				Cliente cliente = new Cliente();
				
				cliente.setId(rs.getLong("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCPF(rs.getString("cpf"));
				cliente.setEmail(rs.getString("email"));
				cliente.setEndereco(rs.getString("endereco"));
				cliente.setTelefone(rs.getString("telefone"));
				
				clientes.add(cliente);
			}
		}
		
		return clientes;
	}
}
