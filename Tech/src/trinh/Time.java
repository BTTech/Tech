package trinh;
/*Time.java
 *Shows and calculates the percentage of each time
 *September/22/16
 *Brendan Trinh
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		double Designing;
		double Coding;
		double Debugging;
		double Testing;
		double Time;
		
		System.out.print("Designing: ");
		Designing=scan.nextDouble();
		
		System.out.print("Coding: ");
		Coding=scan.nextDouble();

		System.out.print("Debugging: ");
		Debugging=scan.nextDouble();
		
		System.out.print("Testing: ");
		Testing=scan.nextDouble();
		
		Time=Designing+Coding+Debugging+Testing;
		
		System.out.format("%5s %15s", "Task", "% Time\n");
		
		System.out.format("%5s", " Designing:   %" + df.format ((Designing/Time)*100));
		System.out.format("\n");
		System.out.format("%5s", " Coding:      %" + df.format ((Coding/Time)*100));
		System.out.format("\n");
		System.out.format("%5s", " Debugging:   %" + df.format((Debugging/Time)*100));
		System.out.format("\n");
		System.out.format("%5s", " Testing:     %" + df.format((Testing/Time)*100));
	}

}
