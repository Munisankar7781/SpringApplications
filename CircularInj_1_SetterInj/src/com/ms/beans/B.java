package com.ms.beans;

public class B {
	
	private A aa;
	
	public B() {
		System.out.println("B::0-param constructor exceuted");
	}
	
	public void setAa(A aa) {
		this.aa = aa;
	}

	@Override
	public String toString() {
		return  "B  class exceuted::aa"; 
	}
}
