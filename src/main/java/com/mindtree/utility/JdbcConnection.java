package com.mindtree.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {
	private static final String url = "jdbc:mysql://localhost:3306/Passportdetails";
	private static final String user = "root";
	private static final String password = "E6EE038@12345";
	
	public static Connection connect() {
	   Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,password);
			System.out.println("Connection success full");
		}catch(SQLException e) {
			System.out.println(e+ " Connection failure");
		}
		return con;
	}
	
	public static void close(Connection con,PreparedStatement pst) {
		try {
			pst.close();
			con.close();
			System.out.println("connection closed");
		}catch(SQLException e) {
			System.out.println("Error : "+e);
		}
	}

	public static void close(Connection con,Statement pst) {
		try {
			pst.close();
			con.close();
			System.out.println("connection closed");
		}catch(SQLException e) {
			System.out.println("Error : "+e);
		}
	}

}
