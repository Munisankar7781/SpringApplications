package com.nt.Test;

import com.ms.components.Flipkart;
import com.nt.Factory.FlipkartFactory;

public class TestApp {

	public static void main(String[] args) {
	
		Flipkart fpkt=FlipkartFactory.getInstance();
		
		// invoke Business method
		String result=fpkt.shopping(new String[] { "shirt","watch","T-shirt"},new float[] {4000.9f,6000.5f,400.9f});
		System.out.println(result);
		

	}

}
