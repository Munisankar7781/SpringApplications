package com.nt.test;

import com.nt.components.Employee;
import com.nt.components.Food;

public class TestApp2SoftwareCom {
	public static void main(String[] args) {
		// Software company needs Employee
		// create dependent class object
		Food food = new Food();
		// create Target class object
		Employee emp = new  Employee(food);
		emp.work();
	}
}
