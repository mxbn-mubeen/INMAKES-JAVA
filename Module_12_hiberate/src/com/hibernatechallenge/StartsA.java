package com.hibernatechallenge;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.model.Customer;
import com.model.Employee;

public class StartsA {

	public static void main(String[] args) {
		
		try {
			
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			SessionFactory factory=cfg.buildSessionFactory();
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			
			Query query = session.createQuery("from Employee where employeename like 'A%'");
			ArrayList<Employee> empdet = (ArrayList<Employee>) query.list();
			System.out.println("Employee details starting with A");
			System.out.println("-------------------------");
			for(Employee emp : empdet) {
			    System.out.println(emp.getEmpno() + "\t" + emp.getEmployeename() + "\t" + emp.getSalary() + "\t" + emp.getJob() + "\t" + emp.getDeptno());
			}
				
		}
		catch(Exception e){
			
			e.printStackTrace();
		}

	}

}
