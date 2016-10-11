import java.text.DecimalFormat;
import java.util.Scanner;
public class Food {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		double burger;
		double fries;
		double soda;
		double change;
		double tax;
		double beforeTax;
		double total;
		double amountTendered;
		
		System.out.print("Enter the number of burgers:" );
		burger=scan.nextDouble() * 1.69;
		
		System.out.print("Enter the number of fries:" );
		fries=scan.nextDouble() * 1.09;
		
		System.out.print("Enter The number of sodas:");
		soda=scan.nextDouble() * 0.99;
		
		System.out.println("Total before tax:" + (burger+fries+soda));
		beforeTax=burger+fries+soda;
		
		System.out.println("Tax:" + (beforeTax * 0.065));
		tax=beforeTax * 0.065;
		
		System.out.println("Total with tax:" + (beforeTax+tax));
		total=tax+beforeTax;
		
		System.out.print("Enter amount tendered:");
		amountTendered=scan.nextDouble();
		
		System.out.println("Change" + (amountTendered - total));
		
	}

}
