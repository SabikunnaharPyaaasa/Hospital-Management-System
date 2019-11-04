package com.se.assignment;
class User{
	private String id;
	private String name;
	private String phoneNumber;
	private String address;
	User(){}
	User(String id,String name,String phoneNumber,String address){
	this.id=id;
	this.name=name;
	this.phoneNumber=phoneNumber;
	this.address=address;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return address;
	}
	public void showInformation(){
		System.out.println("Id: "+getId());
		System.out.println("Name: "+getName());
		System.out.println("Phone Number: "+getPhoneNumber());
		System.out.println("Address: "+getAddress());
	}
}