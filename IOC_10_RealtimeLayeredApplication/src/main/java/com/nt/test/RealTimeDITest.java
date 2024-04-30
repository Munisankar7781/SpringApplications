package com.nt.test;

import java.util.Scanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ms.vo.CustomerVo;
import com.nt.controller.MainController;

public class RealTimeDITest {
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Customer name::");
		String name=scan.nextLine();
		System.out.println("Enter customer address::");
		String address = scan.nextLine();
		System.out.println("Enter Primciple Amount");
		String pamt=scan.next();
		System.out.println("enter timeofintrest");
		String toi=scan.next();
		System.out.println("enter rateofintrest");
		String roi=scan.next();
		
		
		//create vo class objects having the inputs
		CustomerVo vo= new CustomerVo();
		vo.setCustomername(name);
		vo.setCustomeraddress(address);
		vo.setPrincipleamount(pamt);
		vo.setTimeofintrest(toi);
		vo.setRateofintrest(roi);
		
		//craete ioc container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/ms/cfgs/ApplicationContext.xml");
		MainController  mc=ctx.getBean("controller",MainController.class);
		
		//use controller
		try
		{
			String message=mc.ProcessCustomer(vo);
			System.out.println(message);
		}
		catch(Exception e)
		{
			e.getMessage();
			System.out.println("Internal Problem try again");
		}
	}
}
