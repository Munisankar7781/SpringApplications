package com.ms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;
import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.ms.bo.PatientBo;
import com.ms.dto.PatientDto;

public class PatientOracleImpl implements IpatientDao {
	
	private DataSource ds;
	private static final String query="INSERT INTO PATIENTS_DATAS VALUES(S_NO.NEXTVAL,?,?,?,?,?,?,?,?)";
	
	public PatientOracleImpl(DataSource ds) {
		super();
		System.out.println("PatientOracleImpl::1-param constructor created");
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
