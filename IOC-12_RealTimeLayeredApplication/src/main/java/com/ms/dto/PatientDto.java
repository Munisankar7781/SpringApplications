package com.ms.dto;

import java.io.Serializable;

public class PatientDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String patientname;
	private String patientaddress;
	private int mobileno;
	private int noof_hospitilized;
	private float bill_perday;
	
	//setterrs and getters
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	@Override
	public String toString() {
		return "PatientDto [patientname=" + patientname + ", patientaddress=" + patientaddress + ", mobileno="
				+ mobileno + ", noof_hospitilized=" + noof_hospitilized + ", bill_perday=" + bill_perday + "]";
	}


}
