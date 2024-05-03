package com.nt.service;

import com.ms.bo.CustomerBo;
import com.ms.dto.CustomerDto;
import com.nt.dao.ICustomerDao;

public final class CustomerServiceMangImpl implements IcustomerMgmtService{
	
	private ICustomerDao dao;
	
	public CustomerServiceMangImpl(ICustomerDao dao) {
		super();
		System.out.println("CustomerServiceMangImpl::1-param constructor created");
		this.dao = dao;
	}

	@Override
	public String CalculateSimpleIntrest(CustomerDto dto) throws Exception 
	{
		Float principleamount=dto.getPrincipleamount();
		Float timeofintrest=dto.getTimeofintrest();
		Float rateofintrest=dto.getRateofintrest();
		Float simpleintrest=principleamount*timeofintrest*rateofintrest/100.0f;
		
		//gives inputs to the CuStomerBo object
		CustomerBo bo = new CustomerBo();
		bo.setCustomername(dto.getCustomername());
		bo.setCustomeraddress(dto.getCustomeraddress());
		bo.setPrincipleamount(dto.getPrincipleamount());
		bo.setTimeofintrest(dto.getTimeofintrest());
		bo.setRateofintrest(dto.getRateofintrest());
		bo.setSimpleintrest(simpleintrest);
		//use DAO service
		int count=dao.insert(bo);
		return count >= 1?"customer registered sucessfully"+" ...> "+" Simple Intrest::"+simpleintrest:"customer registrtion failed";

	}
}
