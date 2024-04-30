package com.nt.controller;

import com.ms.dto.CustomerDto;
import com.ms.vo.CustomerVo;
import com.nt.service.IcustomerMgmtService;

public final class MainController {
	private IcustomerMgmtService service;

	public MainController(IcustomerMgmtService service) {
		super();
		System.out.println("Maincontroller::1-param constructor created");
		this.service = service;
	}
	
	public String ProcessCustomer(CustomerVo vo) throws Exception
	{
		//convert to vo to dto;
		String result;
		try
		{
		CustomerDto dto = new CustomerDto();
		dto.setCustomeraddress(vo.getCustomeraddress());
		dto.setCustomername(vo.getCustomername());
		dto.setPrincipleamount( Float.parseFloat(vo.getPrincipleamount()));
		dto.setTimeofintrest(Float.parseFloat(vo.getTimeofintrest()));
		dto.setRateofintrest(Float.parseFloat(vo.getRateofintrest()));
		// use service 
		 result=service.CalculateSimpleIntrest(dto);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		return result;
	}
}
