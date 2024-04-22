package com.nt.Factory;

import com.ms.components.BlueDart;
import com.ms.components.Courier;
import com.ms.components.Dtdc;
import com.ms.components.FedEx;
import com.ms.components.Flipkart;

public class FlipkartFactory {

	public static Flipkart getInstance(String type) {
		
		// create dependent obj
		
		Courier courier=null;
		
		if(type.equalsIgnoreCase("dtdc"))
		{
			courier=new Dtdc();
		}
		else if(type.equalsIgnoreCase("bdart"))
		{
			courier=new BlueDart();
		}
		else if(type.equalsIgnoreCase("fdex"))
		{
			courier = new FedEx();
		}
		else
		{
			throw new IllegalArgumentException("Ivalid Courier type");
		}
		
		//create target class object
		Flipkart fpkt = new Flipkart();;
		fpkt.setCourier(courier);
		
		return fpkt;
		
	}
}
