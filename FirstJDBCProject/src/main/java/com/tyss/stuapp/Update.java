package com.tyss.stuapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		String driver="org.postgresql.Driver";
		String url="jdbc:postgresql://localhost:5432/studentapp";
		String user="postgres";
		String password="root";
		
		try {
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			Statement stm = con.createStatement();
			
			String update="UPDATE student SET name='Sanchit' WHERE sid=1";
			
			stm.execute(update);
			
			con.close();
			
			System.out.println("record updated and connection is closed");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
