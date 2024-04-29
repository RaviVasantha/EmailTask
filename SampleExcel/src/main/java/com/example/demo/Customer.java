package com.example.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	private long ACNO;	
	private String REMARK1;	
	private String FLAG;	
	private long CIFNO;
	private String NAME;
	private int LIMITAMT;	
	private double OUTAMT;	
	private String SANDT;
	private long MOB2;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getACNO() {
		return ACNO;
	}
	public void setACNO(long aCNO) {
		ACNO = aCNO;
	}
	public String getREMARK1() {
		return REMARK1;
	}
	public void setREMARK1(String rEMARK1) {
		REMARK1 = rEMARK1;
	}
	public String getFLAG() {
		return FLAG;
	}
	public void setFLAG(String fLAG) {
		FLAG = fLAG;
	}
	public long getCIFNO() {
		return CIFNO;
	}
	public void setCIFNO(long cIFNO) {
		CIFNO = cIFNO;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public int getLIMITAMT() {
		return LIMITAMT;
	}
	public void setLIMITAMT(int lIMITAMT) {
		LIMITAMT = lIMITAMT;
	}
	public double getOUTAMT() {
		return OUTAMT;
	}
	public void setOUTAMT(double oUTAMT) {
		OUTAMT = oUTAMT;
	}
	public String getSANDT() {
		return SANDT;
	}
	public void setSANDT(String sANDT) {
		SANDT = sANDT;
	}
	public long getMOB2() {
		return MOB2;
	}
	public void setMOB2(long mOB2) {
		MOB2 = mOB2;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", ACNO=" + ACNO + ", REMARK1=" + REMARK1 + ", FLAG=" + FLAG + ", CIFNO=" + CIFNO
				+ ", NAME=" + NAME + ", LIMITAMT=" + LIMITAMT + ", OUTAMT=" + OUTAMT + ", SANDT=" + SANDT + ", MOB2="
				+ MOB2 + ", address=" + address + "]";
	}
	
}
