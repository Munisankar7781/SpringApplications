package com.nt.factory;

import com.nt.components.Employee;
import com.nt.components.Food;
import com.nt.components.Person;
import com.nt.components.Student;

public class PersonFactory {
	
	public static Person getPerson(String type) throws IllegalAccessException {
		
		//create Dependent class object
		Food food = new Food();
		//create target class object
		Person per =null;
		
		if(type.equalsIgnoreCase("emp"))
		{
			per=new Employee(food);
		}
		else if(type.equalsIgnoreCase("stu"))
		{
			per= new Student(food);
		}
		else
		{
			throw new IllegalAccessException("Invalid Person Type");
		}
		
		return per;
	}

}
