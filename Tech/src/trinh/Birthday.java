package trinh;
/*Birthday.java
 *Shows birthday and generates number from the birth day and month
 *September/10/16
 *Brendan Trinh
 */
import java.util.Scanner;

public class Birthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int number;
		int birthDay;
		int birthMonth;
		int january;
		int febuary;
		int march;
		int april;
		int may;
		int june;
		int july;
		int august;
		int september;
		int october;
		int november;
		int december;
		
		
		january=1;
		febuary=2;
		march=3;
		april=4;
		may=5;
		june=6;
		july=7;
		august=8;
		september=9;
		october=10;
		november=11;
		december=12;
		
		
		System.out.print("BirthMonth: ");
		birthMonth=scan.nextInt();
		
		System.out.print("BirthDay: ");
		birthDay=scan.nextInt();
		
		number=( birthDay+(5*(9+(4*(6+(birthMonth*5))))));
		
		System.out.println("Your number is: " + number);
		
		System.out.println("Your Birthday is: "+ birthMonth +"\\"+ birthDay);
	}

}
