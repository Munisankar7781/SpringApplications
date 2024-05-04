package com.ms.bo;

public class PatientBo {
	
	private String patientname;
	private String patientaddress;
	private int mobileno;
	private int noof_hospitilized;
	private float bill_perday;
	private float total_billamount;
	private float discount;
	private float netbillamount;
	
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
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public int getNoof_hospitilized() {
		return noof_hospitilized;
	}
	public void setNoof_hospitilized(int noof_hospitilized) {
		this.noof_hospitilized = noof_hospitilized;
	}
	public float getBill_perday() {
		return bill_perday;
	}
	public void setBill_perday(float bill_perday) {
		this.bill_perday = bill_perday;
	}
	public float getTotal_billamount() {
		return total_billamount;
	}
	public void setTotal_billamount(float total_billamount) {
		this.total_billamount = total_billamount;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public float getNetbillamount() {
		return netbillamount;
	}
	public void setNetbillamount(float netbillamount) {
		this.netbillamount = netbillamount;
	}
	@Override
	public String toString() {
		return "PatientBo [patientname=" + patientname + ", patientaddress=" + patientaddress + ", mobileno=" + mobileno
				+ ", noof_hospitilized=" + noof_hospitilized + ", bill_perday=" + bill_perday + ", total_billamount="
				+ total_billamount + ", discount=" + discount + ", netbillamount=" + netbillamount + "]";
	}
}
