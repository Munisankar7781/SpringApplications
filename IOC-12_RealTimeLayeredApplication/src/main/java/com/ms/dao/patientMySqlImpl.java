package com.ms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.ms.bo.PatientBo;

public class patientMySqlImpl implements IpatientDao {
	
	 private DataSource ds;

	private static final String query="INSERT INTO PATIENTS_DATAS(patient_name,patient_address,mobile_num,num_hospitilized,bill_perday,total_billamount,discount,Net_billamount) VALUES(?,?,?,?,?,?,?,?)";
	
	public patientMySqlImpl(DataSource ds) {
		super();
		System.out.println("PatientMySqlImpl::1-param constructor created");
		this.ds = ds;
	}

	

	@Override
	public int insert(PatientBo bo) throws Exception {
int count;
		
		try(Connection con = ds.getConnection();
			PreparedStatement ps=con.prepareStatement(query))
		{
			//set query param values
			ps.setString(1,bo.getPatientname());
			ps.setString(2, bo.getPatientaddress());
			ps.setInt(3,bo.getMobileno());
			ps.setInt(4, bo.getNoof_hospitilized());
			ps.setFloat(5, bo.getBill_perday());
			ps.setFloat(6, bo.getTotal_billamount());
			ps.setFloat(7, bo.getDiscount());
			ps.setFloat(8, bo.getNetbillamount());
			
			//excute query
			 count=ps.executeUpdate();
		}
		catch(Exception e)
		{
			throw e;
		}
		return count;
	}

}
