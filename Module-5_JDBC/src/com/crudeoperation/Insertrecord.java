package com.crudeoperation;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Insertrecord {

	@SuppressWarnings("deprecation")
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
			
			//Statement stmt=con.createStatement();
			
			
			PreparedStatement ps=con.prepareStatement("INSERT INTO EMPLOYEE(EMPID,EMPNAME,DOJ)"+"VALUES(?,?,?)");
			
			System.out.println("Enter the empid:");
			empid=scn.nextInt();
			
			System.out.println("Enter the employee name:");
			empname=scn.next();
			
			System.out.println("Enter the Employee Date Of Joining:");
			strDate=scn.next();
			SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
			
			doj=dateformat.parse(strDate);
			sqldoj =new java.sql.Date(doj.getTime());
			
			
			//String query=("INSERT INTO EMPLOYEE(EMPID,EMPNAME,DOJ) VALUES("+empid+","+"'"+empname+"'"+","+"'"+sqldoj+"')");
			
			//System.out.println(query);
			
			//count=stmt.executeUpdate(query);
			
			ps.setInt(1, empid);
			ps.setString(2, empname);
			ps.setDate(3, sqldoj);
			
			count=ps.executeUpdate();
			if(count!=0) {
				System.out.println(count+"Record Inserted....");
			}
			else {
				System.out.println("Reord Insertion Failed!!!!");
			}
			
			//stmt.close();
			ps.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
