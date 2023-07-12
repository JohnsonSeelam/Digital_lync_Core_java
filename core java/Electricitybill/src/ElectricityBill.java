import java.util.Scanner;
public class ElectricityBill {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of units");
		int units= scanner.nextInt();
		System.out.println(units);
		double billpay=0;
		if(units>=0 && units<=50) {
			billpay=(units*1.45);
			System.out.println("The current bill is:"+ billpay);
			
		}else if(units>=51 && units<=100) {
			billpay=(50*1.45)+  ((units-50)*2.60);
			System.out.println("The current bill is:"+ billpay);
		}else {
			billpay=(50*1.45) +(100*2.60) +((units-100)*3.30);
			System.out.println("The current bill is:"+ billpay);
			
		}
	}
}
