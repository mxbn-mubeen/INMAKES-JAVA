package com.comparatorinterface;

import java.util.Comparator;

public class Pricecomparator implements Comparator<Book>{

	@Override
	public int compare(Book x, Book y) {
		if(x.price>y.price)
			return 1;
		else if (x.price==y.price)
			return 0;
		else
			return -1;
	}

}
