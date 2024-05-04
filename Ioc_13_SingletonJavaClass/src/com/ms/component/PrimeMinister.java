package com.ms.component;

public class PrimeMinister {
	
	static PrimeMinister pm;
	
	private PrimeMinister()
	{
		System.out.println("PrimeMinister::0-param constructor is created");
	}
	
	public static PrimeMinister getObject()
	{
		if(pm==null)
		{
			pm=new PrimeMinister();
		}
		return pm;
	}

}
