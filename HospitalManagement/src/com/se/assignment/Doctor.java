package com.se.assignment;
class Doctor extends User{
	private String specialist;
	private String timing;
	private String qualification;
	private Medicine prescribeMedicine;
	Doctor(){
		super();
	}
	Doctor(String id,String name,String phoneNumber,String address,String specialist,String timing,String qualification,Medicine prescribeMedicine){
		super(id,name,phoneNumber,address);
		this.specialist=specialist;
		this.timing=timing;
		this.qualification=qualification;
		this.prescribeMedicine=prescribeMedicine;
	}
	public void setSpecialist(String specialist){
		this.specialist=specialist;
	}
	public String getSpecialist(){
		return specialist;
	}
	public void setTiming(String timing){
		this.timing=timing;
	}
	public String getTiming(){
		return timing;
	}
	public void setQualification(String qualification){
		this.qualification=qualification;
	}
	public String getQualification(){
		return qualification;
	}
	
	public void setPrescribeMedicine(Medicine prescribeMedicine) {
		this.prescribeMedicine=prescribeMedicine;	
	}
	public Medicine getPrescribeMedicine() {
		return prescribeMedicine;	
	}
	public void showInformation(){
		System.out.println(".........Doctor Details.......");
		super.showInformation();
		System.out.println("Specialist: "+getSpecialist());
		System.out.println("Timing: "+getTiming());
		System.out.println("Doctor Qualificaltion: "+getQualification());
		System.out.println("Prescibe Medicine: "+getPrescribeMedicine());
}
}