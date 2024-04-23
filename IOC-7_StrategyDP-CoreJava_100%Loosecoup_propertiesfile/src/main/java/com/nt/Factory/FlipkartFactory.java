package com.nt.Factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;
import com.ms.components.Courier;
import com.ms.components.Flipkart;

public class FlipkartFactory {

	//link properties file in Factory class
	
	private static Properties prop;
	static { 
		try
		{
			//Locate Properties File
			InputStream is = new FileInputStream("com/nt/Commons/input.Properties");
			//Load properties file conent into java.util.Properties obj
			prop=new Properties();
			prop.load(is);			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//static factory method having factory pattern logic
	public static Flipkart getInstance()
	{
		try {
			//get dependent class name(courier name) from properties file(java.util.Properties class obj)
			String courierName=prop.getProperty("courier.type");
			//Load and create dependent class oject
			Class c= Class.forName(courierName);                                  //newinstance() deprecated from java9
			Constructor cons[]=c.getDeclaredConstructors();
		    Courier courier=(Courier)cons[0].newInstance();
		    //create target class object
		    Flipkart fpkt = new Flipkart();
		    //assign dependent class obj to target class object
		    fpkt.setCourier(courier);
		    return fpkt;
		    
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
}
