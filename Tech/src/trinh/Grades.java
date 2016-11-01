package trinh;

	/*Print.java
	 *Show Grades
	 *October/1/16
	 *Brendan Trinh
	 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		int testscore;
		char grade;
		
		System.out.print("Enter Testscore: ");
		testscore=scan.nextInt();
		
		if (testscore >= 90)
			grade= 'A';
		
		else if (testscore >= 80)
			grade= 'B';
		
		else if (testscore >= 70)
			grade= 'C';
		
		else if (testscore >= 60)
			grade= 'D';
		
		else
			grade= 'F';
		
		System.out.print("Grade: " + grade);
	}

}
