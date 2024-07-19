package com.example.demo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Book  implements Serializable{
	
	@Value("101")
	private int bookid;
	@Value("spring boot tutorial")
	private String bookname;
	@Value("799")
	private double price;
	
	@Autowired
	private Author author;

	public Book() {
		System.out.println("book object created");
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void show() {
		
		System.out.println("-----------------------------");
		System.out.println("book id= "+bookid);
		System.out.println("book name= "+bookname);
		System.out.println("book price= "+price);
		author.showauthordetails();
		System.out.println("-----------------------------");
	}

}
