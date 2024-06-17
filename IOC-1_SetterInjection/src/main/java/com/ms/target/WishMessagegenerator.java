package com.ms.target;

import java.util.Date;

public class WishMessagegenerator {
	private Date date;

	// constructor
	public WishMessagegenerator() {
		System.out.println("WishMessageGenerator::0-param constructor exceuted");
	}

	// using seter() to perform dependency Injection
	public void setDate(Date date) {
		this.date = date;
	}

	// Business Method
	public String generateWishMessage(String user) {
		// get currentt hour of the day
		int hour = date.getHours(); // 24hrs format
		if (hour < 12) {
			return "goodmoring" + "..." + user + "..." + date;
		} else if (hour < 16) {
			return "goodAfternoon" + "..." + user + "..." + date;
		} else if (hour < 20) {
			return "goodevening" + "...." + user + "..." + date;
		} else {
			return "Goodnight" + "..." + user + "...." + date;
		}
	}
}
