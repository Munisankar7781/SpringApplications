package com.ms.target;

import java.util.Date;

public class PrimeMinster
{
	static PrimeMinster pm;
	
	private PrimeMinster()
	{
		System.out.println("PrimeMinister::0-param constructor is created");
	}
	
	public static PrimeMinster getObject()
	{
		if(pm==null)
		{
			pm=new PrimeMinster();
		}
		return pm;
	}
}
