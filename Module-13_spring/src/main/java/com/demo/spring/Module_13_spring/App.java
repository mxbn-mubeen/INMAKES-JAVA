package com.demo.spring.Module_13_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Computer c=context.getBean(Computer.class);
        c.display();
    }
}
