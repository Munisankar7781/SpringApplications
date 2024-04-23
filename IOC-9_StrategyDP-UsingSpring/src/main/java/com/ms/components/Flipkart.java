package com.ms.components;

import java.util.Arrays;
import java.util.Random;

public final  class Flipkart {
	
	private Courier courier;
	
	
	//constructor
	public Flipkart(Courier courier)
	{
		
		super();
		System.out.println("Flipkart::1-param constructor exceuted");
		this.courier = courier;
	}
	
   //Setters
	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	
	//Business Method
	public String shopping(String[]items,float[]prices) {
		
		float billAmt=0.0f;
		for(float p:prices) {
			billAmt+=p;
		}
		//generate orderId
		int oid=new Random().nextInt(1000);
		//use courier
		String message=courier.deliver(oid);
		
		return Arrays.toString(items)+"with prices"+Arrays.toString(prices)+"having billamt"+billAmt+":::"+message;
		
	}

}
