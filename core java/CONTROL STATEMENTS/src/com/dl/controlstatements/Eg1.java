package com.dl.controlstatements;

public class Eg1 {

	public static void main(String[] args) {
		int age=18;
		if(age>=18) {
			System.out.println("You are Eligible to vote:"+ age);
		}else {
			System.out.println("You are not Eligible to vote"+age);
		}
		age=17;
		if(age>=18) {
			System.out.println("You are Eligible to vote:"+ age);
		}else {
			System.out.println("You are not Eligible to vote:"+age);
		}

	}

}
