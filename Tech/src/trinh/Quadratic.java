package trinh;
/*Quadratic.java
 *Shows and calculates the quadratic equation
 *September/28/16
 *Brendan Trinh
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		int a, b, c;
		
		System.out.println("Enter Number");
		
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		System.out.println(df.format(-1*b+(Math.sqrt(Math.pow(b,2)+(-4*(a*c)))/2*a)));
		
		System.out.println(df.format(-1*b-(Math.sqrt(Math.pow(b,2)+(-4*(a*c)))/2*a)));
	}

}

