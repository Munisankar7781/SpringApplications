package com.nt.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ms.components.Flipkart;

public class TestApp {

	public static void main(String[] args) {
		
		//craete Ioc container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/ms/cfgs/ApplicationContext.xml");
		Flipkart ft=ctx.getBean("fpkt",Flipkart.class);
		String res=ft.shopping(new String[] {"mango","bannana","orange"}, new float[] {120.7f,566.8f,234.5f});
		System.out.println(res);
		

	}

}
