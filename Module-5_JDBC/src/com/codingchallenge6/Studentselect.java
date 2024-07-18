package com.codingchallenge6;

import java.sql.*;
public class Studentselect {

	public static void main(String[] args)  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cd6","root","spectratec@22");
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("SELECT  * FROM STUDENT");
			
			System.out.println("STUDENT_ID \t STUDENT_NAME \t STUDENT_PLACE \t COURSE \t CONTACT_NUM ");
			System.out.println("----------------------------------------------------------------------------------------");
			
			while(rs.next()) {
			
				
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3)
				+ "\t" + rs.getString(4) + "\t" + rs.getString(5));
			}
			
			rs.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
