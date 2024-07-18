package com.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class Storedprocedurecall {

	public static void main(String[] args) {
		
		int empid;
		Scanner scn=new Scanner(System.in);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/constraints","root","spectratec@22");
			CallableStatement cs=con.prepareCall("{call find_employee(?)}");
			
			System.out.println("Enter the Empid:");
			empid=scn.nextInt();
			
			cs.setInt(1, empid);
			ResultSet rs=cs.executeQuery();
			
			System.out.println("EMPID \t  EMPANME \t  DOJ");
			System.out.println("---------------------------------------");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDate(3));
			}
			
			rs.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
