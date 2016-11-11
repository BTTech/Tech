package trinh;
/*RandomGenerator.java
 *Creates 10 random numbers
 *November/11/16
 *Brendan Trinh
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class RandomGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		DecimalFormat df = new DecimalFormat ("0.00");
		
	final	int	seed=979;
	final	int a=234565;
	final	int c=2534337;
	final	int m=253425;
		
	double x1;
	double x2;
	double x3;
	double x4;
	double x5;
	double x6;
	double x7;
	double x8;
	double x9;
	double x10;
	

		
		x1=((a*seed + c) %m);

		x2=((a*x1 + c) %m);

		x3=((a*x2 + c) %m);

		x4=((a*x3 + c) %m);

		x5=((a*x4 + c) %m);

		x6=((a*x5 + c) %m);

		x7=((a*x6 + c) %m);

		x8=((1236*x7 + 200) %50);

		x9=((1236*x8 + 200) %50);

		x10=((1236*x9 + 200) %50);
		
		System.out.println(df.format(x1));
		
		System.out.println(df.format(x2));
		
		System.out.println(df.format(x3));
		
		System.out.println(df.format(x4));
		
		System.out.println(df.format(x5));
		
		System.out.println(df.format(x6));
		
		System.out.println(df.format(x7));

		System.out.println(df.format(x8));

		System.out.println(df.format(x9));
		
		System.out.println(df.format(x10));

	}

}
