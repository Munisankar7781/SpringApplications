package com.ms.controller;

import com.ms.bo.PatientBo;
import com.ms.dao.IpatientDao;
import com.ms.dto.PatientDto;
import com.ms.service.IPatientService;
import com.ms.vo.patientVo;

public class MainController{
	
	private IPatientService service;

	
	public MainController(IPatientService service) {
		super();
		System.out.println("MainController::1-param constructor created");
		this.service = service;
	}
	
	public String processMessage(patientVo vo) throws Exception
	{
		//processs vo object TO DTO 
		//CREATE DTO OBJECT
		PatientDto dto = new PatientDto();
		dto.setPatientname(vo.getPatientname());
		dto.setPatientaddress(vo.getPatientaddress());
		dto.setMobileno(Integer.parseInt(vo.getMobileno()));
		dto.setNoof_hospitilized(Integer.parseInt(vo.getNoof_hospitilized()));
		dto.setBill_perday(Float.parseFloat(vo.getBill_perday()));
		
		//use service
		String message=null;
		try
		{
		 message=service.getResult(dto);
		}
		catch(Exception e)
		{
			throw e;
		}
		return message;
	}
}
