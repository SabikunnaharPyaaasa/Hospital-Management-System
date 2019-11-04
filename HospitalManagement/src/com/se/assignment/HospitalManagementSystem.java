package com.se.assignment;
public class HospitalManagementSystem{
	public static void main(String []args){
		System.out.println(".................................................");
		System.out.println("**********Hospital Management System**********");
		System.out.println("\n");
		Doctor [] d=new Doctor [25];
		Patient[] p=new Patient[100];
		Medicine[] m=new Medicine[500];
		Employee[] e=new Employee[30];
		int i;
		 for (i = 0; i < 25; i++)
			 d[i] = new Doctor();
		 
		 for (i = 0; i < 100; i++)
			 p[i] = new Patient();
		 
		 for (i = 0; i < 500; i++)
			 m[i] = new Medicine();
		 
		 for (i = 0; i < 30; i++)
			 e[i] = new Employee();
		m[0]= new Medicine("Paracetamol","01-01-18","01-09-20");
		m[1]= new Medicine("acetaminophen","01-01-18","01-09-20");
		m[2]= new Medicine("aspirin","01-01-18","01-09-20");
		m[3]= new Medicine("Children's Tylenol","01-01-18","01-09-20");
		m[4]= new Medicine("Easprin","01-01-18","01-09-20");
		m[0]. showMedicineDetails();
		m[1].showMedicineDetails();
		d[0]=new Doctor("12","Abir","017...22","Dhaka","Cardiology","8am-12pm","MBBS",m[1]);
		d[0].showInformation();
		p[0]=new Patient("18-36368-1","AAAAA","01625228982","Bashundhara","fever",21,"Female");
		p[0].showInformation();
		BillPayment b1=new BillPayment(12,p[0]);
		b1.billInformation();
	}
}