package com.se.assignment;
class Employee extends User{
	private String designation;
	Employee(){
		super();
	}
	Employee(String id,String name,String phoneNumber,String address,String designation){
		super(id,name,phoneNumber,address);
		this.designation=designation;
	}
	public void setDesignation(String designation){
		this.designation=designation;
	}
	public String getDesignation(){
		return designation;
	}
	public void showInformation(){
		super.showInformation();
		System.out.println("Employee Designation: "+getDesignation());
}
}