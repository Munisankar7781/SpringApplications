package com.ms.beans;

public class A {
	private B bb;
	
	
	public A(B bb) {
		super();
		System.out.println("A::1-param constructor excuted");
		this.bb = bb;
	} 

	@Override
	public String toString() {
		return "A  class exceuted::bb";
	}

}
