package com.hibernatechallenge;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.model.Employee;

import java.util.List; // Correct import for List

public class Salbetween {

    public static void main(String[] args) {

        try {

            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");

            SessionFactory factory = cfg.buildSessionFactory();
            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();

            List<Employee> employees = session.createCriteria(Employee.class)
                    .add(Restrictions.between("salary", 5000, 7000))
                    .list();


            for (Employee employee : employees) {
                System.out.println("Employee ID: " + employee.getEmpno()
                        + ", Name: " + employee.getEmployeename()
                        + ", Salary: " + employee.getSalary());
            }

            tx.commit();
            session.close();
            factory.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

