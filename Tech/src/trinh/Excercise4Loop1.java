package trinh;

import java.util.Scanner;

/*ExcerciseRandom2.java
 *Rolls a die for the user and computer then says who won then ask the player if they want to play again
 *November/15/16
 *Brendan Trinh
 */
public class Excercise4Loop1 {

	private static final int yes = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int dice1;
		int dice2;
		int play;
do{
		dice1 = (int)(Math.random()*11)+2;
		dice2= (int)(Math.random()*11)+2;

		if (dice1>dice2)
			System.out.println("User won!!!");

		else if (dice2>dice1)
			System.out.println("Computer won!!!");

		else if (dice1==dice2)
			System.out.println("Its a tie!!!");

		int dice3 = (int)(Math.random()*11)+2;
		int dice4= (int)(Math.random()*11)+2;

		System.out.println("Want to play agian? Type 1 ");
		play=scan.nextInt();
}while(play==1);

	}

}
