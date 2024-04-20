package com.nt.test;

import com.nt.components.Person;
import com.nt.factory.PersonFactory;

public class TestApp2SoftwareCom {
	public static void main(String[] args) throws IllegalAccessException {
		// Software company needs Employee
	       Person per=PersonFactory.getPerson("emp");
	       per.work();
	
	}
}
