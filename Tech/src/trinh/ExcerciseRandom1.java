package trinh;
/*ExcerciseRandom1.java
 *Enter name then tells the user if the name is their favorite or not
 *October/11/16
 *Brendan Trinh
 */
import java.util.Scanner;

public class ExcerciseRandom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		


		System.out.print("Name:");
		String name=scan.nextLine();
		
		int x = (int) ((Math.random()*100)+1);
		
		if (x<=29)
			System.out.println(name +" is not your favorite name");
		
		else if (x>=30)
		System.out.print(name +" is your favorite name");
	}

}
