package com.ms.components;

public class FedEx implements Courier{
	
	public FedEx() {
		System.out.println("FedEx::0-param constructor exceuted");
	}

	@Override
	public String deliver(int oid) {
		return "Delivering"+oid+"order id order products using FedEx";
		
	}

}
