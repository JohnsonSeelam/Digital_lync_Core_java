package com.dl.controlstatements;
import java.util.Scanner;

public class Eg5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter User Name:");
		String username = scanner.nextLine();
		System.out.println("User name:"+ username);
		double usersalary = scanner.nextDouble();
		System.out.println(usersalary);
		if(usersalary == 10000) {
			System.out.println("User salary is:"+ usersalary);
			
		}else if(usersalary == 20000) {
			System.out.println("User salary is:"+ usersalary);
		}else if(usersalary == 30000) {
			System.out.println("User salary is:"+ usersalary);
		}else if(usersalary == 40000) {
			System.out.println("User salary is:"+ usersalary);
		}else if(usersalary == 50000) {
			System.out.println("User salary is:"+ usersalary);
		}else {
			System.out.println("User salary is not validated");
		}


	}

}
