package com.ms.component;

public class TestApp {
	
	public static void main(String[]args)
	{		
		PrimeMinister p1=PrimeMinister.getObject();
		PrimeMinister p2=PrimeMinister.getObject();
		System.out.println(p1.hashCode()+"....."+p2.hashCode());
	}

}
