package com.hibernatechallenge;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class RetrievingRecords {

    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        // Retrieve an Employee instance
        Employee emp1 = session.get(Employee.class, 1L);
        	System.out.println("----------------");
            System.out.println("Employee found:");
            System.out.println("Employee Number: " + emp1.getEmpno());
            System.out.println("Employee Name: " + emp1.getEmployeename());
            System.out.println("Salary: " + emp1.getSalary());
            System.out.println("Job: " + emp1.getJob());
            System.out.println("Department Number: " + emp1.getDeptno());
        session.close();
        factory.close();
    }
}
