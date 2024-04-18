package com.ms.beans;

public class B {
	
	private A aa;
	
	
	public B(A aa) {
		super();
		System.out.println("B::1-param constructor exceuted");
		this.aa = aa;
	}

	@Override
	public String toString() {
		return  "B  class exceuted::aa"; 
	}
}
