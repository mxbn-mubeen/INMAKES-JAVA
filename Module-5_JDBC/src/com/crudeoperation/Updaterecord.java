package com.crudeoperation;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Updaterecord {

	public static void main(String[] args)  {
		
		int empid;
		String empname;
		java.util.Date doj;
		String strDate;
		java.sql.Date sqldoj;
		int count=0;
		Scanner scn=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/constraints","root","spectratec@22");
			
			PreparedStatement ps=con.prepareStatement("UPDATE EMPLOYEE SET EMPNAME=? ,DOJ=? WHERE EMPID=?");
			
			System.out.println("Enter the empid if you want to update:");
			empid=scn.nextInt();
			
			System.out.println("Enter the employee name:");
			empname=scn.next();
			
			System.out.println("Enter the Employee Date Of Joining:");
			strDate=scn.next();
			SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
			
			doj=dateformat.parse(strDate);
			sqldoj =new java.sql.Date(doj.getTime());
			
			
			ps.setString(1, empname);
			ps.setDate(2, sqldoj);
			ps.setInt(3, empid);
					
			count=ps.executeUpdate();
			if(count!=0) {
				System.out.println(count+" Update Record ....");
			}
			else {
				System.out.println(" Update Record  Failed!!!!");
			}
			
			
			ps.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
