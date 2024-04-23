package com.ms.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ms.beans.A;
import com.ms.beans.B;

public class TestApp {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/ms/cfgs/ApplicationContext.xml");
		A rr=ctx.getBean("Aclass",A.class);
		System.out.println(rr);
		System.out.println("=================");
		B rr1=ctx.getBean("Bclass",B.class);
		System.out.println(rr1);

	}

}
