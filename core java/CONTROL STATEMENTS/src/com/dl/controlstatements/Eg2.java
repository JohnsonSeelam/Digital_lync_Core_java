package com.dl.controlstatements;

import java.util.Scanner;
public class Eg2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age= scanner.nextInt();
		if(age>=18) {
			System.out.println("You are Eligible to vote:"+ age);
		}else {
			System.out.println("You are not Eligible to vote:"+age);
		}

		
	}

}
