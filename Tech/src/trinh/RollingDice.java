package trinh;
/*RollingDice.java
 *The program rolls 2 dices 10000 times and record for much of each number comes up
 *December/12/16
 *Brendan Trinh
 */
public class RollingDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] DiceNumbers = {0,0,0,0,0,0,0,0,0,0,0};
		
		for (int x=1; x<10000; x++)
		{
		int dice1 = (int)(Math.random()*6)+1;
		int dice2= (int)(Math.random()*6)+1;
		
		
		int totalDice= dice1+dice2;
		
		DiceNumbers[totalDice-2]=DiceNumbers[totalDice-2]+1;
	}
		System.out.format("%2s %8s %8s","2",DiceNumbers[0],"\n");
		System.out.format("%2s %8s %8s","3",DiceNumbers[1],"\n");
		System.out.format("%2s %8s %8s","4",DiceNumbers[2],"\n");
		System.out.format("%2s %8s %8s","5",DiceNumbers[3],"\n");
		System.out.format("%2s %8s %8s","6",DiceNumbers[4],"\n");
		System.out.format("%2s %8s %8s","7",DiceNumbers[5],"\n");
		System.out.format("%2s %8s %8s","8",DiceNumbers[6],"\n");
		System.out.format("%2s %8s %8s","9",DiceNumbers[7],"\n");
		System.out.format("%2s %8s %8s","10",DiceNumbers[8],"\n");
		System.out.format("%2s %8s %8s","11",DiceNumbers[9],"\n");
		System.out.format("%2s %8s %8s","12",DiceNumbers[10],"\n");
	}

}
