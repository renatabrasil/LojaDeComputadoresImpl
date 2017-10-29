package br.com.pcs3643.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class GenericDAO {
	
	static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
	static final String USER = "root";
	static final String PASSWORD = "admin";
	static final String DATABASE_URL = "jdbc:mariadb://localhost:3306/loja_de_computadores_db";
    Connection connection = null;
    Statement statement = null; 
    ResultSet resultSet = null; 
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("The following error has occured: " + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public void DisconnectFromDB() {

        try {
            resultSet.close();
            statement.close();
            connection.close();
        } // end try                                               
        catch (Exception ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        } // end catch  
    }
	
	public ResultSet read(String sql_stmt) {
        try {

            statement = connection.createStatement();
                                    
            resultSet = statement.executeQuery(sql_stmt);

            return resultSet;

        } 
        catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }                                                    

        return resultSet;
    }

    public void execute(String sql_stmt) {
        try {
            statement = connection.createStatement();
                                    
            statement.executeUpdate(sql_stmt);
        } 
        catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
    }
	
}
