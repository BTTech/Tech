package trinh;
/*ExcerciseRandom2.java
 *Rolls a die for the user and computer then says who won
 *October/11/16
 *Brendan Trinh
 */
public class ExcerciseRandom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dice1= (int)(Math.random()*6)+1;
		int dice2= (int)(Math.random()*6)+1;

		if (dice1>dice2)
			System.out.println("User won!!!");
		
		else if (dice2>dice1)
			System.out.println("Computer won!!!");
		
		else if (dice1==dice2)
			System.out.println("Its a tie!!!");
	}

}
