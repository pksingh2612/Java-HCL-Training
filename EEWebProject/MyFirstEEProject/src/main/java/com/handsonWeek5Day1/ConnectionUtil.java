package com.handsonWeek5Day1;


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/handson","root","1234");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
