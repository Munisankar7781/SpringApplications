package com.nt.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import javax.sql.DataSource;
import com.ms.bo.CustomerBo;

public final class CustDaoMysqlImpl implements ICustomerDao {

	private static final String sqlquery = "INSERT INTO REALTIME_CUSTOMERS(CUSTOMERNAME,CUSTOMERADDRESS,PRINCIPLEAMOUNT,TIMEOFINTREST,RATEOFINTREST,SIMPLEINTREST)VALUES(?,?,?,?,?,?)";
	private DataSource datasource;

	public CustDaoMysqlImpl(DataSource datasource) {
		System.out.println("custDaoMysqlImpl:1-param constructor created");
		this.datasource = datasource;
	}

	@Override
	public int insert(CustomerBo bo) throws Exception {
		int count = 0;
		// try with resources
		try (Connection con = datasource.getConnection(); PreparedStatement ps = con.prepareStatement(sqlquery)) {
			// set Query Values to Insert
			ps.setString(1, bo.getCustomername());
			ps.setString(2, bo.getCustomeraddress());
			ps.setFloat(3, bo.getPrincipleamount());
			ps.setFloat(4, bo.getTimeofintrest());
			ps.setFloat(5, bo.getRateofintrest());
			ps.setFloat(6, bo.getSimpleintrest());

			// excute the Query
			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return count;
	}
}
