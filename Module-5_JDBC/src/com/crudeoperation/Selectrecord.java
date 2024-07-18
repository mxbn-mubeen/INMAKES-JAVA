package com.crudeoperation;

import java.sql.*;
public class Selectrecord {

	public static void main(String[] args)  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/constraints","root","spectratec@22");
			Statement stmt=con.createStatement();
			//ResultSet rs=stmt.executeQuery("SELECT  * FROM CUSTOMER");
			ResultSet rs=stmt.executeQuery("SELECT  * FROM CUSTOMER WHERE CITY=\'SALEM\'");
			System.out.println("CustomerID \t CustomerName \t Address \t City \t Postal_code \t state \t country");
			System.out.println("---------------------------------------------------------------------------------");
			while(rs.next()) {
				
				System.out.println(rs.getInt("customerid") + "\t" + rs.getString("customername") + "\t" + rs.getString("address")
                + "\t" + rs.getString("city") + "\t" + rs.getInt("postalcode") + "\t" + rs.getString("state") + "\t" + rs.getString("country"));
				
				/*System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3)
				+ "\t" + rs.getString(4) + "\t" + rs.getInt(5) + "\t" + rs.getString(6) + "\t" + rs.getString(7));*/
			}
			rs.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
