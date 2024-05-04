package com.ms.dao;

import com.ms.bo.PatientBo;
import com.ms.dto.PatientDto;

public interface IpatientDao {
	
	public int insert(PatientBo bo) throws Exception;

}
