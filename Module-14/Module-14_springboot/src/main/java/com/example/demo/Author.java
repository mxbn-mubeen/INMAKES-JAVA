package com.example.demo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Author implements Serializable{
	
	@Value("101")
	private int authorid;
	@Value("george")
	private String authorname;
	@Value("chicago")
	private String Address;

	public Author() {
	System.out.println("author object invoked");
	}

	public int getAuthorid() {
		return authorid;
	}

	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public void showauthordetails() {
		
		System.out.println("--------------------");
		System.out.println("author id= "+authorid);
		System.out.println("author name= "+authorname);
		System.out.println("author address= "+Address);
		
	}
	
}
