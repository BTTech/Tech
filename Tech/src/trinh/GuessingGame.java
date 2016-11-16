package trinh;
/*GuessingGame.java
 *User chooses a number then the computer checks if it matches the random number
 *November/11/16
 *Brendan Trinh
 */
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		int number;

		int random= (int)(Math.random()*20)+1;

		System.out.print("Choose a number between 1-20: ");
		number=scan.nextInt();

		if (number == random)
			System.out.println("You Won!!!");

		else if (number!= random)
			System.out.println("Better Luck Next Time!!!");

		System.out.println("Player Number: " +number);

		System.out.println("Computer NUmber: " +random);
	}

}
