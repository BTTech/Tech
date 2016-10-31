package trinh;
/*IfStatementExcercise1.java
 *
 *October/31/16
 *Brendan Trinh
 */
import java.util.Scanner;

public class IfStatementExcercise1 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		int number;

		System.out.print("Enter Number: ");
		number=scan.nextInt();

		if (number > 0)
		{
		System.out.println("Your Number is Positive ");
		}
		else
		{	
		System.out.println("Your Number is Negative");
		}
		
		if (number % 7 == 0)
		{
		System.out.println("Your Number is Divisable by 7");
		}
		else
		{
		System.out.println("Your Number is not Divisable by 7");	
		}
		
	}
		
}
