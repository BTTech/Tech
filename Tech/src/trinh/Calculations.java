package trinh;
/*Calculations.java
 *Shows and calculates the equations
 *September/15/16
 *Brendan Trinh
 */
import java.util.Scanner;

public class Calculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int num1,num2,num3,num4,num5;
		
		System.out.println("Enter Number:");
		
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		num4=scan.nextInt();
		num5=scan.nextInt();
		
		System.out.println("The sum of all five numbers "+ (num1+num2+num3+num4+num5));
		System.out.println("The result after subtracting the second number from the third is "+ (num2-num3));
		System.out.println("The product of the first and fith is "+ (num1*num5));
		System.out.println("The quotient of the forth number divided by the second number is "+ (num4/num2));
		System.out.println("The remainder when dividing the forth number by the second number is "+ (num4%num2));
		System.out.println("The first number raised to the power of the third number is "+ Math.pow(num1, num3));
		System.out.println("The square root of the fifth number is "+ Math.sqrt(num5));
	}

}
