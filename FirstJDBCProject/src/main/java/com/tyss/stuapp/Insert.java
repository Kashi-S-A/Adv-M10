package com.tyss.stuapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/studentapp";
		String user = "postgres";
		String password = "root";

		try {
			// step 1 Load the driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded");

			// step 2 Create connection
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("connection is created");

			// Step 3 Create Statement
			Statement stm = connection.createStatement();
			System.out.println("Statement is created");

			String insert = "INSERT INTO student VALUES(1,'Penga',926578872)";

			// Step 4 Execute the query
			boolean result= stm.execute(insert);
			System.out.println(result);
			
			System.out.println("Data inserted");

			// step 5 close the connection
			connection.close();
			System.out.println("Connection is closeds");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
