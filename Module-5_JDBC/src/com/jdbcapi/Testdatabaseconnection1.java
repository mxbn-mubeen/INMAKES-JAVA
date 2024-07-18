package com.jdbcapi;

import java.sql.*;
public class Testdatabaseconnection1 {

	public static void main(String[] args)  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/asq","root","spectratec@22");
			Statement s=con.createStatement();
			if(con!=null) {
				System.out.println("Database connected.....");
			}
			else {
				System.out.println("Database connection failed!!!");
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
