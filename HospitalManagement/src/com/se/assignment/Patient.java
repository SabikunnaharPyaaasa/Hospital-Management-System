package com.se.assignment;
class Patient extends User{
	private String disease;
	private int age;
	private String gender;
	Patient(){
		super();
	}
	Patient(String id,String name,String phoneNumber,String address,String disease,int age,String gender){
		super(id,name,phoneNumber,address);
		this.disease=disease;
		this.age=age;
		this.gender=gender;
	}
	public void setDisease(String disease){
		this.disease=disease;
	}
	public String getDisease(){
		return disease;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	public String getGender(){
		return gender;
	}
	@Override
	public String toString() {
		return "Patient [disease=" + disease + ", age=" + age + ", gender=" + gender + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getPhoneNumber()=" + getPhoneNumber() + ", getAddress()="
				+ getAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public void showInformation(){
		System.out.println("............Patient Details..........");
		super.showInformation();
		System.out.println("Disease: "+getDisease());
		System.out.println("Age: "+getAge());
		System.out.println("Gender: "+getGender());
}
}