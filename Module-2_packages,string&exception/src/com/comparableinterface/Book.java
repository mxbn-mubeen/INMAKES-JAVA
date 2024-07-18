package com.comparableinterface;

public class Book implements Comparable{
	
	String bookname;
	int pages;
	

	public Book(String bookname,int pages) {
		
		this.bookname = bookname;
		this.pages=pages;
	}


	@Override
	public int compareTo(Object x) {
		
		Book b1=(Book)x;
		//return this.bookname.length()- b1.bookname.length();
		return this.pages-b1.pages;
	}


	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", pages=" + pages + "]";
	}



	
	
}
