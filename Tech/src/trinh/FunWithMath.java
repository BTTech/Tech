package trinh;
/*FunWithMath.java
 *The user types out two numbers and types a number that represents if it's addition, subtraction, multiplication, and division. Also ask the player if they want to restart.
 *January/16/17
 *Brendan Trinh
 */
import java.util.Scanner;

public class FunWithMath {
	/**
	 * 
	 */
	public static void printA(int add1, int add2){
		System.out.println("The answer "+ (add1+add2));
	}
	/**
	 * 
	 */
	public static void printS(int subtract1, int subtract2){
		System.out.println("The answer "+ (subtract1-subtract2));

	}
	/**
	 * 
	 */
	public static void printM(int multiply1, int multiply2){
		System.out.println("The answer "+ (multiply1*multiply2));

	}
	/**
	 * 
	 */
	public static void printD(int division1, int division2){
		System.out.println("The answer "+ (division1/division2));

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int play = 0;
		int num1;
		int num2;
		int symbol;


		do{
			System.out.print("What are the two numbers you like to choose");
			num1=scan.nextInt();
			num2=scan.nextInt();

			System.out.print("1 = +|");
			System.out.print("2 = -|");
			System.out.print("3 = x|");
			System.out.print("4 = /");
			symbol=scan.nextInt();

			if (symbol==1){
				printA(num1, num2);
			}

			else if (symbol==2){
				printS(num1, num2);
			}

			else if (symbol==3){
				printM(num1, num2);
			}

			else if (symbol==4){
				printD(num1, num2);
			}

			System.out.println("Want to play again? Type 1 ");
			play=scan.nextInt();

		}while(play==1);
	}
}


