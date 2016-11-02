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

		int dozen;
		int egg;
		
		System.out.print("Enter Amount of Dozen Eggs: ");
		dozen=scan.nextInt();
		System.out.print("Enter Amount of Extra Eggs: ");
		egg=scan.nextInt();

		if (egg <=3){
			System.out.println(" Price per dozen egg is: $0.50");
			System.out.println("Total cost is: $" +df.format (dozen * 0.50 +( egg * 0.04166666666)));
		}

		else if ( egg <= 5){
			System.out.println("Price per dozen egg is: $0.45");
			System.out.println("Total cost is: $" +df.format (dozen * 0.45 +( egg * 0.0375)));
		}

		else if ( egg <=10){
			System.out.println("Price per dozen egg is: $0.40");
			System.out.println("Total cost is: $" +df.format (dozen * 0.40 +( egg * 0.03333333333)));
		}

		else if ( egg >=11){
			System.out.println("Price per dozen egg is: $0.35");
			System.out.println("Total cost is: $" +df.format (dozen * 0.35 +( egg * 0.02916666666)));
		}

		System.out.println("Total Amount of eggs: " + (dozen * 12 +( egg)));


	}

}
