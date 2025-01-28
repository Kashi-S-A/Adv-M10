package com.tyss.stuapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {
	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";

String url="jdbc:postgresql://localhost:5432/studentapp?user=postgres&password=root";

		try {
			Class.forName(driver);

			Connection connection = DriverManager.getConnection(url);

			Statement stm = connection.createStatement();

			String fetch = "SELECT * FROM student";
			
//			stm.execute(fetch);
//			
//			ResultSet rs = stm.getResultSet();

			ResultSet rs = stm.executeQuery(fetch);
			System.out.println("------------Students------------");
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getLong(3));
				System.out.println("====================");
			}
			
			connection.close();

			System.out.println("data fetched and connection closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
