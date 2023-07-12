package com.dl.Elements;

public class Eg3 {
	//static variables
	static int a=10;
	static int b=20;
	
	//instance variable
	int c=30;
	//main method (BD)
	public static void main(String[] args) {
		System.out.println(a+" "+b);
		Eg3 eg= new Eg3();
		eg.m1();
		m2();

	}
	//instance method
	public void m1() {
		//if we call static variable to instance method we compalsory call( class name and varaiable name)
		System.out.println(Eg3.a+" "+Eg3.b);
		//direct access to instance variable to instance method
		System.out.println(c);
	}
	//static method
	public static void m2() {
		
		System.out.println(a+" "+b);
	}

}
