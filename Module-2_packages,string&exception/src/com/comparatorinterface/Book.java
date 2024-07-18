package com.comparatorinterface;

public class Book implements Comparable<Book> {
	
	String bookname;
	int pages;
	double price;
	
	public Book(String bookname, int pages, double price) {
		this.bookname = bookname;
		this.pages = pages;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", pages=" + pages + ", price=" + price + "]";
	}
	
	
	@Override
	public int compareTo(Book x) {
		Book b1=(Book)x;
		//return pages-b1.pages;
		//return this.bookname.compareTo(b1.bookname);
		return this.bookname.length()-b1.bookname.length();
		
	}
}
