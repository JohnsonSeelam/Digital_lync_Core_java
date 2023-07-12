package com.dl.Elements;

public class InstanceMethod {
	
	//instance variable
	int a=10;
	int b=20;

	public static void main(String[] args) {
		//calling instance method.
		InstanceMethod eg= new InstanceMethod();
		eg.m1();
		
	}
	//instance method
	public void m1() {
		System.out.println(a+" "+b);
		
	}

}
