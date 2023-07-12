package com.dl.Elements;

public class Variables {
	//2) Static variables are return in outside the main method.
	static int x=100;
	static int y=200;
	
	//3)Instance variable or non static variables.
	int i=2000;
	int j=3000;

	public static void main(String[] args) {
//		Types of varables
		//1) Local variables (this is return in inside the main method)
		int a=10;
		int b=20;
		System.out.println(a+" "+b);
		//first method for static variables. direct access
		System.out.println(x+" "+y);
		//second method for static variables. calls by using class name.
		System.out.println(Variables.x+" "+Variables.y);
		
		//new is keyword for creating class.
		//object name and class name must be same
		Variables eg= new Variables();
		System.out.println(eg.i+" "+eg.j);
		
		

	}

}
