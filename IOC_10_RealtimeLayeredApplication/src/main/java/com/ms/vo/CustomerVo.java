package com.ms.vo;

public class CustomerVo {
	
	private String customername;               //CustID Generated dynamically
	private String customeraddress;
	private String principleamount;
	private String timeofintrest;
	private String  rateofintrest; 
	//it acts like a form data to collects inputs and outputs as a String
	
	// setters and getters
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

	public String getPrincipleamount() {
		return principleamount;
	}
	public void setPrincipleamount(String principleamount) {
		this.principleamount = principleamount;
	}

	public String getTimeofintrest() {
		return timeofintrest;
	}
	public void setTimeofintrest(String timeofintrest) {
		this.timeofintrest = timeofintrest;
	}

	public String getRateofintrest() {
		return rateofintrest;
	}
	public void setRateofintrest(String rateofintrest) {
		this.rateofintrest = rateofintrest;
	}



	@Override
	public String toString() {
		return "CustomerVo [customername=" + customername + ", customeraddress=" + customeraddress
				+ ", principleamount=" + principleamount + ", timeofintrest=" + timeofintrest + ", rateofintrest="
				+ rateofintrest + "]";
	}
	
	

}
