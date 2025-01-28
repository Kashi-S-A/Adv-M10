package com.tyss.stuapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/studentapp";
		String user = "postgres";
		String password = "root";

		try {
			Class.forName(driver);

			Connection connection = DriverManager.getConnection(url, user, password);

			Statement stm = connection.createStatement();

			String delete = "DELETE FROM student WHERE sid=1";
			
			stm.execute(delete);
			
			connection.close();
			
			System.out.println("record deleted and connection is closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
