package com.ms.components;

public class BlueDart implements Courier {

	public BlueDart() {
	System.out.println("Bluedart::0-param constructor exceuted");
	}
	
	@Override
	public String deliver(int oid) 
	{
		return "Delivering"+oid+"order id order products using BlueDart";
	}

}
