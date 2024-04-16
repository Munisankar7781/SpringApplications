package com.nt.beans;

public class Person 
{
	private int pid;
	private String pname;
	private String paddrs;
	private float income;
	
	
	// Parameterized constructor
	public Person(int pid, String pname, float income) 
	{
		System.out.println("Person:4-param constructor executed");
		this.pid = pid;
		this.pname = pname;
		this.paddrs = paddrs;
		this.income = income;
		System.out.println(pid+"...."+pname+"...."+paddrs+"..."+income);
	}

	//setters
	public void setPid(int pid) {
		this.pid = pid;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public void setPaddrs(String paddrs) {
		this.paddrs = paddrs;
	}


	public void setIncome(float income) {
		this.income = income;
	}
	@Override
	public String toString() 
	{
		
		return pid+"..."+pname+"....."+paddrs+"...."+income;
	}
}
