package com.ms.target;

import java.util.Date;

public class WishMessagegenerator 
{
	private Date date;
	
	//constructor
	public WishMessagegenerator(Date date) 
	{
		System.out.println("WishMessageGenerator::1-param constructor exceuted");
		this.date=date;
		System.out.println(date);
	}
	
	//using seter() to perform dependency Injection
	public void setDate(Date date) {
		this.date = date;
	}
	
	//Business Method
	public String generateWishMessage(String user) {
		System.out.println("wishMessgeGenerator.generateWishMessage()...."+"..."+date);
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
