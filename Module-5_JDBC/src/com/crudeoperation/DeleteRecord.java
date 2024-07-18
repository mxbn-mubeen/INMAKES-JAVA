package com.crudeoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRecord {

	public static void main(String[] args) {
		
		int empid;
		int count=0;
		Scanner scn=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/constraints","root","spectratec@22");
			
			PreparedStatement ps=con.prepareStatement("DELETE FROM EMPLOYEE WHERE EMPID=?");
			
			System.out.println("Enter the Employee ID to delete:");
			empid=scn.nextInt();
			
			ps.setInt(1, empid);
			
			count=ps.executeUpdate();
			if(count!=0) {
				System.out.println(count+"  Record  Deleted....");
			}
			else {
				System.out.println("  Record Deletion Failed!!!!");
			}
			
			
			ps.close();
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
