package com.hibernatechallenge;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.model.Employee;

import java.util.List; 

public class Maximumsalaries {

    public static void main(String[] args) {

        try {

            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");

            SessionFactory factory = cfg.buildSessionFactory();
            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();
            
            String hqlMin = "from Employee e where 2 = (select count(distinct salary) from Employee where salary < e.salary)";
            Employee secondMinSalary = session.createQuery(hqlMin, Employee.class).uniqueResult();
            System.out.println("2nd Minimum Salary: " + secondMinSalary.getSalary());

            String hqlMax = "from Employee e where 2 = (select count(distinct salary) from Employee where salary > e.salary)";
            Employee secondMaxSalary = session.createQuery(hqlMax, Employee.class).uniqueResult();
            System.out.println("2nd Maximum Salary: " + secondMaxSalary.getSalary());


            tx.commit();
            session.close();
            factory.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

