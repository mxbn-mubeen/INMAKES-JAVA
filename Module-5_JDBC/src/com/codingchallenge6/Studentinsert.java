package com.codingchallenge6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Studentinsert {

    public static void main(String[] args) {

    	  int student_id;
    	  String student_name,student_place,course,contact_num;
          Scanner scn = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cd6", "root", "spectratec@22");

            PreparedStatement ps = con.prepareStatement("INSERT INTO STUDENT (STUDENT_ID, STUDENT_NAME, STUDENT_PLACE, COURSE, CONTACT_NUM) VALUES (?, ?, ?, ?, ?)");

            
            System.out.println("Enter the number of records to insert:");
            int numRecords = scn.nextInt();

            for (int i = 0; i < numRecords; i++) {
                System.out.println("Enter details for student " + (i + 1) + ":");
                
                System.out.println("Enter the student id:");
                student_id = scn.nextInt();

                System.out.println("Enter the student name:");
                student_name = scn.next();

                System.out.println("Enter the student place:");
                student_place = scn.next();

                System.out.println("Enter the course:");
                course = scn.next();

                System.out.println("Enter the contact number:");
                contact_num = scn.next();

              
                ps.setInt(1, student_id);
                ps.setString(2, student_name);
                ps.setString(3, student_place);
                ps.setString(4, course);
                ps.setString(5, contact_num);

                
                ps.addBatch();
            }

           
            int[] batchCounts = ps.executeBatch();

           
            int totalRecordsInserted = 0;
            for (int count : batchCounts) {
                if (count > 0) {
                    totalRecordsInserted += count;
                }
            }

            System.out.println(totalRecordsInserted + " records inserted successfully.");

            ps.close();
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } 
    }
}
