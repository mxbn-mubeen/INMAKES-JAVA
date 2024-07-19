package com.demo.spring.Module_13_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	@Value("dell")
	private String company;
	@Value("75000")
	private double price;
	@Autowired
	private Monitor mn;
	
	

	public Computer(Monitor mn) {
		super();
		this.mn = mn;
	}

	public Computer() {
		System.out.println("computer object created..");
	}

	void display() {
		if(mn!=null) {
			System.out.println("monitor working fine.its "+"company="+company+" price="+price);
			mn.displayMonitor();
		}
		else {
			System.out.println("monitor is not working");
		}
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setMn(Monitor mn) {
		this.mn = mn;
	}
	
	
}
