package com.comparableinterface;

import java.util.Arrays;

public class Comparableinterfaceexample {

	public static void main(String[] args) {
		//string arr[]={"java","android","php","sql","c"};
		/*Book myBook[]= {new Book("java"),
				new Book("android"),
				new Book("php"),
				new Book("sql"),
				new Book("c"),};*/
		
		Book b1=new Book("java",450);
		Book b2=new Book("android",560);
		Book b3=new Book("java",408);
		Book b4=new Book("java",490);
		Book b5=new Book("java",650);
		Book myBook[]= {b1,b2,b3,b4,b5};
		
		Arrays.sort(myBook);
		for(Book s:myBook) {
			System.out.println(s);
		}

	}

}
