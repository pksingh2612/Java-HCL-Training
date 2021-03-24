package com.Week2_Day2;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getName()==o2.getName())
			return 0;
		else
			return -1;
		
	}

}
