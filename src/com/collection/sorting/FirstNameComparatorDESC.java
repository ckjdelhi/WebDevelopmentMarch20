package com.collection.sorting;

import java.util.Comparator;

public class FirstNameComparatorDESC implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.getFirstName().compareTo(o1.getFirstName());
	}

}