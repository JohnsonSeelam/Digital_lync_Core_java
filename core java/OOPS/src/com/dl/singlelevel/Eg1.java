package com.dl.singlelevel;
class parent{
	public void m1() {
		System.out.println("M1 method");
	}
}
class child extends parent{
	public void m2() {
		System.out.println("m2 method");
	}
}

public class Eg1 {

	public static void main(String[] args) {
		child ch= new child();
		ch.m1();
		ch.m2();
		

	}

}
