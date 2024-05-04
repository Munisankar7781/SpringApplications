package com.ms.service;

import com.ms.bo.PatientBo;
import com.ms.dao.IpatientDao;
import com.ms.dto.PatientDto;

public class PatientServiceImpl implements IPatientService{
	
	private IpatientDao dao;

	public PatientServiceImpl(IpatientDao dao) {
		super();
		 System.out.println("PatientServiceImpl::1-param constructor created");
		this.dao = dao;
	}

	@Override
	public String getResult(PatientDto dto) throws Exception 
	{
		// get reuired inputs from dto
		int no_of_people=dto.getNoof_hospitilized();
		float bill_Per_day=dto.getBill_perday();
		
		//CALCULATION FOR TOTAL BILL AMOUNT
		float totalbillamount = no_of_people*bill_Per_day;
		
		//CALCULATION FOR DISCOUNT Amount
		float discount;
		
		if(totalbillamount>100000.00F)
		{
			//discount is 10%
		     discount =totalbillamount*10/100;
		}
		else if(totalbillamount>500000.00F)
		{
			//discount is 40%
			discount =totalbillamount*40/100;
		}
		else
		{
			//discount is 5%
			discount =totalbillamount*5/100;
		}
			
		// calcualte NetBILLAMOUNT
		float net_bill_amount = totalbillamount-discount;
		
		
		// Give the inputs to bo class
		PatientBo bo= new PatientBo();
		bo.setPatientname(dto.getPatientname());
		bo.setPatientaddress(dto.getPatientaddress());
		bo.setMobileno(dto.getMobileno());
		bo.setBill_perday(dto.getBill_perday());
		bo.setNoof_hospitilized(dto.getNoof_hospitilized());
		bo.setTotal_billamount(totalbillamount);
		bo.setDiscount(discount);
		bo.setNetbillamount(net_bill_amount);
		
		// use dao class
		int count=dao.insert(bo);
		if(count>=1)
		{
			return "Corana patient Registration Successfull....>"+totalbillamount+"..."+discount+"..."+net_bill_amount;
		}
		else
		{
			return "Corana patient Registration UnSuccessfull....>InternalProblem Tryagain";
		}
		
	}

}
