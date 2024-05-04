package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ms.target.WishMessagegenerator;

public class TestApp 
{
	public static void main(String[]args)
	{
		//create Ioc container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfg/ApplicationContext.xml" );
		
		//Get Target Bean class obj from ioc container
		WishMessagegenerator wm=ctx.getBean("wmg",WishMessagegenerator.class);
		WishMessagegenerator wm1 =ctx.getBean("wmg",WishMessagegenerator.class);
		System.out.println(wm.hashCode()+"......"+wm1.hashCode());
		System.out.println("=========================================");
		
		//Get Target Bean class obj from ioc container
		WishMessagegenerator wm2=ctx.getBean("wmg1",WishMessagegenerator.class);
		WishMessagegenerator wm3 =ctx.getBean("wmg1",WishMessagegenerator.class);
		System.out.println(wm2.hashCode()+"......"+wm3.hashCode());
		//invoke Business Method;
		String result=wm.generateWishMessage("Muni");
		System.out.println(result);   
	}
}
