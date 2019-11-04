package com.se.assignment;
class Medicine{
	private String medicineName;
	private String productionDate;
	private String ExpDate;
	Medicine(){}
	
	public Medicine(String medicineName, String productionDate, String expDate) {
		this.medicineName = medicineName;
		this.productionDate = productionDate;
		ExpDate = expDate;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}

	public String getExpDate() {
		return ExpDate;
	}

	public void setExpDate(String expDate) {
		ExpDate = expDate;
	}
	
@Override
	public String toString() {
		return "Medicine [medicineName=" + medicineName + ", productionDate=" + productionDate + ", ExpDate=" + ExpDate
				+ "]";
	}

public void showMedicineDetails() {
		System.out.println("Medicine Name: "+getMedicineName());
		System.out.println("Medicine Production Date: "+getProductionDate());
		System.out.println("Medicine Expiry Date: "+ getExpDate());
	}

	
	
	
}