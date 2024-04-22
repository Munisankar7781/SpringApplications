package com.ms.components;

public class Dtdc implements Courier{

	public Dtdc() {
		System.out.println("Dtdc::0-param constructor executed");
	}

	@Override
	public String deliver(int oid) {
		return "Delivering"+oid+"order id order products using Dtdc";
	}

}
