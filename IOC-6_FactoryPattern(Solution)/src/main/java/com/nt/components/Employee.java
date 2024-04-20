package com.nt.components;

public class Employee extends Person {

	private int salary;
	private String Company;
	private Food food;
	
	public Employee(Food food) 
	{
		System.out.println("Employeee:1-param constructor exceuted");
		this.food = food;
	}

	@Override
	public void work() {
		System.out.println("Employee.work()");
		System.out.println("Employyeee is working on Software develpoment and taking"+"..."+food);
	}

}
