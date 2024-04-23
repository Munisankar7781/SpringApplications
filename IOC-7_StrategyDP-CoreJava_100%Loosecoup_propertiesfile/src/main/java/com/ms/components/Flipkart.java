package com.ms.components;

import java.util.Arrays;
import java.util.Random;

public final  class Flipkart {
	
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart::0-param constructor executed");
	}

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
