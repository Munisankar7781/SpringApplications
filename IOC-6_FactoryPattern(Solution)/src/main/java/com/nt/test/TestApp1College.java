package com.nt.test;

import com.nt.components.Person;
import com.nt.factory.PersonFactory;

public class TestApp1College 
{
	public static void main(String[]args) throws IllegalAccessException
	{
		//college needs student
	Person per = PersonFactory.getPerson("stu");
	per.work();
		
	}
}
