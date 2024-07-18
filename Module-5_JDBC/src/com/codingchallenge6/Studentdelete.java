package com.codingchallenge6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Studentdelete {

	public static void main(String[] args) {
		
		int student_id;
		int count=0;
		Scanner scn=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cd6","root","spectratec@22");
			
			PreparedStatement ps=con.prepareStatement("DELETE FROM STUDENT WHERE STUDENT_ID=?");
			
			System.out.println("Enter the Student ID to delete:");
			student_id=scn.nextInt();
			
			ps.setInt(1, student_id);
			
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
