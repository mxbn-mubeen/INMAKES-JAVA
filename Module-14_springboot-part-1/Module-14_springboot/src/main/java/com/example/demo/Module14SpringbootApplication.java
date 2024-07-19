package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Module14SpringbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Module14SpringbootApplication.class, args);
		
//		Book b=new Book();//tightely coupled
//		b.show();
		
		Book b=context.getBean(Book.class);//loosely coupled
		b.show();
		Book b2=context.getBean(Book.class);//loosely coupled
		b2.show();
	}

}
