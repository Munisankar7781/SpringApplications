package com.nt.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Person;

public class TestApp {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
		Person per=ctx.getBean("p1",Person.class);
		System.out.println(per);

	}

}
