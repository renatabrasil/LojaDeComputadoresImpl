package br.com.pcs3643.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class GenericDAO {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mariadb://localhost:8080/LojaDeComputadoresImpl", "admin",
					"123456");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
