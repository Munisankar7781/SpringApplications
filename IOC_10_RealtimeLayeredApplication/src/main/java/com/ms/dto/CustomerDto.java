package com.ms.dto;

import java.io.Serializable;

public class CustomerDto implements Serializable {
	
	private String customername;               //CustID Generated dynamically
	private String customeraddress;
	private Float principleamount;
	private Float timeofintrest;
	private Float rateofintrest;
	
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	public Float getPrincipleamount() {
		return principleamount;
	}
	public void setPrincipleamount(Float principleamount) {
		this.principleamount = principleamount;
	}
	public Float getTimeofintrest() {
		return timeofintrest;
	}
	public void setTimeofintrest(Float timeofintrest) {
		this.timeofintrest = timeofintrest;
	}
	public Float getRateofintrest() {
		return rateofintrest;
	}
	public void setRateofintrest(Float rateofintrest) {
		this.rateofintrest = rateofintrest;
	}
	@Override
	public String toString() {
		return "CustomerDto [customername=" + customername + ", customeraddress=" + customeraddress
				+ ", principleamount=" + principleamount + ", timeofintrest=" + timeofintrest + ", rateofintrest="
				+ rateofintrest + "]";
	}

}
