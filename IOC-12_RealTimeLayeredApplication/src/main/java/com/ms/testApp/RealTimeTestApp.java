package com.ms.testApp;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ms.controller.MainController;
import com.ms.vo.patientVo;

public class RealTimeTestApp {
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Patient NAme");
		String pname=scan.nextLine();
		System.out.println("Enter patient Address");
		String paddrs=scan.nextLine();
		System.out.println("Enter MobileNumber");
		String mobile_num=scan.nextLine();
		System.out.println("Enter no.of.people hospitilized");
		String no_of_people=scan.nextLine();
		System.out.println("Enter BillPerday");
		String bill_per_day=scan.nextLine();
		
		//assign end user data to vo object
		patientVo vo= new patientVo();
		vo.setPatientname(pname);
		vo.setPatientaddress(paddrs);
		vo.setMobileno(mobile_num);
		vo.setNoof_hospitilized(no_of_people);
		vo.setBill_perday(bill_per_day);
		
		//create Ioc container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/ms/cfgs/ApplicationContext.xml");
		MainController mc = ctx.getBean("controller",MainController.class);
		try
		{
			String result=mc.processMessage(vo);
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Internal Problem Try again..>"+e.getMessage());
			e.printStackTrace();
		}
	}
}
