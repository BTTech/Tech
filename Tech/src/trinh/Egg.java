package trinh;
/*Egg.java
*Shows amount each dozen cost and how many eggs
*October/1/16
*Brendan Trinh
*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class Egg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		int egg;
		
		System.out.print("Enter Amount of Dozen Eggs: ");
		egg=scan.nextInt();
		
		if (egg <=3){
			System.out.println(" Price per dozen egg is: $0.50");
		System.out.println("Total cost is: $" +df.format (egg * 0.50));
		}
		
		else if ( egg <= 5){
			System.out.println("Price per dozen egg is: $0.45");
		System.out.println("Total cost is: $" +df.format (egg * 0.45));
		}
		
		else if ( egg <=10){
			System.out.println("Price per dozen egg is: $0.40");
		System.out.println("Total cost is: $" +df.format (egg * 0.40));
		}
		
		else if ( egg >=11){
			System.out.println("Price per dozen egg is: $0.35");
		System.out.println("Total cost is: $" +df.format (egg * 0.35));
		}

		System.out.println("Total Amount of eggs: " + egg * 12);
		
		
	}

}
