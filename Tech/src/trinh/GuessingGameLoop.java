package trinh;
/*GuessingGameLoop.java
 *User chooses a number then the computer checks if it matches the random number and loops when you lose and stops when you win
 *November/18/16
 *Brendan Trinh
 */
import java.util.Scanner;

public class GuessingGameLoop {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int number;
		int random= (int)(Math.random()*20)+1;
		
		do{
		System.out.print("Choose a number between 1-20: ");
		number=scan.nextInt();

			if (number == random){
				System.out.println("You Won!!!");
			}
			else if (number!= random)
				System.out.println("Better Luck Next Time!!!");

		}while (number != random);

	}

}
