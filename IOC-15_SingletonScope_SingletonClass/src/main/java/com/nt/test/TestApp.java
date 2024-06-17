package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ms.target.PrimeMinster;

public class TestApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfg/ApplicationContext.xml");
		PrimeMinster prm = ctx.getBean("pminister", PrimeMinster.class);
		PrimeMinster prm1 = ctx.getBean("pminister", PrimeMinster.class);
		System.out.println(prm.hashCode() + "....." + prm1.hashCode());
		System.out.println("================================");
		PrimeMinster prm2 = ctx.getBean("mstr1", PrimeMinster.class);
		PrimeMinster prm3 = ctx.getBean("mstr1", PrimeMinster.class);
		System.out.println(prm2.hashCode() + "......." + prm3.hashCode());
	}
}
