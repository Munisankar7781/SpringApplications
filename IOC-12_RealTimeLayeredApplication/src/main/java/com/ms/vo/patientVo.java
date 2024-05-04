package com.ms.vo;

public class patientVo {
	
	private String patientname;
	private String patientaddress;
	private String mobileno;
	private String noof_hospitilized;
	private String bill_perday;
	
	//setters and getters
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getPatientaddress() {
		return patientaddress;
	}
	public void setPatientaddress(String patientaddress) {
		this.patientaddress = patientaddress;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getNoof_hospitilized() {
		return noof_hospitilized;
	}
	public void setNoof_hospitilized(String noof_hospitilized) {
		this.noof_hospitilized = noof_hospitilized;
	}
	public String getBill_perday() {
		return bill_perday;
	}
	public void setBill_perday(String bill_perday) {
		this.bill_perday = bill_perday;
	}
	
	@Override
	public String toString() {
		return "patientVo [patientname=" + patientname + ", patientaddress=" + patientaddress + ", mobileno=" + mobileno
				+ ", noof_hospitilized=" + noof_hospitilized + ", bill_perday=" + bill_perday + "]";
	}
}
