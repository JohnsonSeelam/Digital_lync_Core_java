package com.dl.Elements;

public class Eg4 {

	public static void main(String[] args) {
		Eg4 customer1= new Eg4();
		customer1.customerDetails("Johnson", 9640413835l, "seelam.johnson12@gmail.com","Hyd");
		bankDetails("ICICI", "Kondapur");
		Eg4 customer2= new Eg4();
		customer2.customerDetails("Johnson", 9640413835l, "seelam.johnson12@gmail.com","Hyd");
		bankDetails("ICICI", "Kondapur");
		Eg4 customer3= new Eg4();
		customer3.customerDetails("Johnson", 9640413835l, "seelam.johnson12@gmail.com","Hyd");
		bankDetails("ICICI", "Kondapur");



	}
	//instance method with args (Maintain multiple copies)
	public void customerDetails(String userName, long contactDetails, String email, String Address){
		System.out.println("UserName:"+ userName);
		System.out.println("ContactDetails:"+ contactDetails);
		System.out.println("Email:"+ email);
		System.out.println("Address:"+ Address);
		
	}
	//static method (Maintain single copy)
	public static void bankDetails(String bankDetails, String bankAddress) {
		System.out.println("Bank Name:"+ bankDetails);
		System.out.println("Bank Address"+ bankAddress);
		System.out.println(" ");
	}

}
