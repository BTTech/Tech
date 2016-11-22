package trinh;
import java.util.Scanner;


public class InvestmentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scan=new Scanner(System.in);

		int year = 1;
		double money= 2500;

		while (money <= 5000){
			money = money * 1.075;
			year= year + 1;
		}

		System.out.println("It will take you "+(int)year +" years");

	}

}
