package com.nt.test;

import com.nt.components.Food;
import com.nt.components.Student;

public class TestApp1College 
{
	public static void main(String[]args)
	{
		//college needs student
		
		// create DependentClass Object
		Food food = new Food();
		// create TargetClass Object
		Student st = new Student(food);
		st.work();
		
		
	}
}
