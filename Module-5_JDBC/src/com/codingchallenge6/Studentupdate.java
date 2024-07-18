package com.codingchallenge6;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Studentupdate {

	public static void main(String[] args)  {
		

		String course,student_place;
		int count=0;
		Scanner scn=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cd6","root","spectratec@22");
			
			PreparedStatement ps=con.prepareStatement("UPDATE STUDENT SET COURSE=? WHERE STUDENT_PLACE=?");
			
			System.out.println("Enter the student_place if you want to update:");
			student_place=scn.next();
			
			System.out.println("Enter the course name:");
			course=scn.next();
			
			ps.setString(1, course);
			ps.setString(2, student_place);
			
					
			count=ps.executeUpdate();
			if(count!=0) {
				System.out.println(count+" Update Record ....");
			}
			else {
				System.out.println(" Update Record  Failed!!!!");
			}
			
			
			ps.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
