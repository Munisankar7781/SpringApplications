package com.ms.target;

import java.util.Date;

public class WishMessagegenerator 
{
	private Date date;
	
	private String Message;
	
	// using constructor[to perform Dependency Injection]
	public WishMessagegenerator(Date date,String Message) {
		System.out.println("WishMessageGenerator::1-param constructor exceuted");
		this.date=date;
	}
	
	public WishMessagegenerator()
	{
		System.out.println("WishMessageGenerator::0-pram constructed");
	}
	

	
	//Business Method
	public String generateWishMessage(String user) {
		//get currentt hour of the day
		int hour=date.getHours();   //24hrs format
		if(hour<12)
		{
			return "goodmoring"+"..."+user+"..."+date;
		}
		else if(hour<16)
		{
			return "goodAfternoon"+"..."+user+"..."+date;
		}
		else if(hour<20)
		{
			return "goodevening"+"...."+user+"..."+date;
		}
		else
		{
			return "Goodnight"+"..."+user+"...."+date;
		}
	}
}
