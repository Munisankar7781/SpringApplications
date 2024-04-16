package com.nt.Test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ms.target.WishMessagegenerator;

public class TestApp1
{
	public static void main(String[]args)
	{
		//create Ioc container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfg/ApplicationContext.xml" );
		//Get Target Bean class obj from ioc container
		WishMessagegenerator wm=ctx.getBean("wmg",WishMessagegenerator.class);
		//invoke Business Method
		String result=wm.generateWishMessage("Muni");
		System.out.println(result);  
	}
}
