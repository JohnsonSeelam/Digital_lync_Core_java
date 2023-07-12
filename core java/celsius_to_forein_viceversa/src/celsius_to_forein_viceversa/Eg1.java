package celsius_to_forein_viceversa;

import java.util.Scanner;

public class Eg1 {

	public static void main(String[] args) {
		// Celsius to Foreinheit
		
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter the Temperature in celsius:");
		 int c = scanner.nextInt(); System.out.println(c); 
		 float f; f=(float) ((c*1.8)+32);
		 System.out.println(f);
		 
		// Foreinheit to celsius
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter the Temperature in Foreinheit:");
		int ff = scanner1.nextInt();
		System.out.println(ff);
		float cc;
		cc = (float) (ff * 0.56) - 32;
		System.out.println(cc);

	}

}
