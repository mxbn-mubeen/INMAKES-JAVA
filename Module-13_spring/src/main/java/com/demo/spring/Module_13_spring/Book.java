package com.demo.spring.Module_13_spring;

public class Book {

	private int bookid;
	private String bookname;
	private String author;
	private double price;
	
	//default constructor
	public Book() {
		System.out.println("book object created..");
	}
	
//	Parameterized constructor
	public Book(int bookid, String bookname, String author, double price) {
		//super();
		this();
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}
	
	
	
	public void display() {
		System.out.println("book printed..");
		System.out.println("bookid="+bookid);
		System.out.println("bookname="+bookname);
		System.out.println("author="+author);
		System.out.println("price="+price); 
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
