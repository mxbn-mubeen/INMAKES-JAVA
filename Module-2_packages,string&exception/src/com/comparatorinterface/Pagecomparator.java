package com.comparatorinterface;

import java.util.Comparator;

public class Pagecomparator implements Comparator<Book>{

	@Override
	public int compare(Book x, Book y) {
		// TODO Auto-generated method stub
		return x.pages-y.pages;
	}

}
