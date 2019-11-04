package com.se.assignment;
class BillPayment{
	private int billNo;
	private Patient patientName;
	BillPayment(){}
	BillPayment(int billNo,Patient patientName){
		this.billNo=billNo;
		this.patientName=patientName;
	}
	public void setBillNo(int billNo){
		this.billNo=billNo;
	}
	public int getBillNo(){
		return billNo;
	}
	public void setPatientName(String patientName){
		this.patientName=patientName;
	}
	public Patient getPatientName(){
		return patientName;
	}
	public void billInformation(){
		System.out.println("Patient Bill no: "+getBillNo());
		System.out.println("Patient details:"+getPatientName());
	}
	
}