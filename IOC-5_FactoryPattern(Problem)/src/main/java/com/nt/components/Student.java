package com.nt.components;

public class Student extends Person {

	private int rollno;
	private String course;
	private Food food;
	
	public Student(Food food) {
		System.out.println("Student::1-param constructor exceuted");
		this.food = food;
	}
	
	@Override
	public void work() {
		System.out.println("Student.work()");
		System.out.println("Student is studying B.Tech(Cs) and taking"+"......."+food);

	}

}
