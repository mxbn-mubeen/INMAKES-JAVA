package com.jdbcapi;

import java.sql.*;
public class Testdatabaseconnection2 {

	public static void main(String[] args)  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/constraints","root","spectratec@22");
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("show tables");
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			rs.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
