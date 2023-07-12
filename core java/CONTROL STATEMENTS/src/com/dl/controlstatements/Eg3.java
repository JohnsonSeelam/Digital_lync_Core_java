package com.dl.controlstatements;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Eg3 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your age:");
		String read = reader.readLine();
		int age = Integer.parseInt(read);
		if(age>=18) {
			System.out.println("You are Eligible to vote:"+ age);
		}else {
			System.out.println("You are not Eligible to vote:"+age);
		}

		reader.close();
		
		

	}

}
