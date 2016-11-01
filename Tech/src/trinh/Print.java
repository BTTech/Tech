package trinh;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		int number;
		int price;
		
		System.out.print("Enter Amount of Copies: ");
		number=scan.nextInt();
		
		if (number <=99){
			
			System.out.println(" Price per copy is: $0.30");
		System.out.println("Total cost is: " +df.format (number * 0.30));
		}
		else if ( number <= 499){
			System.out.println("Price per copy is: $0.28");
		System.out.println("Total cost is: " +df.format (number * 0.28));
		}
		else if ( number <=749){
			System.out.println("Price per copy is: $0.27");
		System.out.println("Total cost is: " +df.format (number * 0.27));
		}
		else if ( number <=1000){
			System.out.println("Price per copy is: $0.26");
		System.out.println("Total cost is: " +df.format (number * 0.26));
		}
		else if ( number >1000){
			System.out.println("Price per copy is: $0.25");
		System.out.println("Total cost is: " +df.format (number * 0.25));
		}
		
	}

}
