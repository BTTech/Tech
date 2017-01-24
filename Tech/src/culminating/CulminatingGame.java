package culminating;
/**
 * Brendan Trinh
 * January 24, 2017
 * CulminatingGame.java
 * Matching game that ask the user for 2 numbers and checks if they match and it replays everytime to be able to have unlimited trys
 */
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import hsa_new.Console;
import javax.imageio.ImageIO;



public class CulminatingGame {
	static Console c = new Console();
	static BufferedImage[] pics = new BufferedImage[30];

	public static void flipCard(Point[] points, int card){
		c.drawImage(pics[card], (int) points[card].getX(), (int)points[card].getY(), 69, 94, c);
	}
	
	public static void loadImages() throws IOException{
		pics[0] = ImageIO.read(new File("src/culminating/card2.png"));
		pics[1] = pics[0];
		pics[2] = ImageIO.read(new File("src/culminating/card3.png"));
		pics[3] = pics[2];
		pics[4] = ImageIO.read(new File("src/culminating/card7.png")); 
		pics[5] = pics[4];
		pics[6] = ImageIO.read(new File("src/culminating/card9.png"));
		pics[7] = pics[6];
		pics[8] = ImageIO.read(new File("src/culminating/cardA.png"));
		pics[9] = pics[8];
		pics[10] = ImageIO.read(new File("src/culminating/cardking-hearts.png"));
		pics[11] = pics[10];
		pics[12] = ImageIO.read(new File("src/culminating/crd10.png"));
		pics[13] = pics[12];
		pics[14] = ImageIO.read(new File("src/culminating/cards.jpg"));
		pics[15] = ImageIO.read(new File("src/culminating/1.jpg"));
		pics[16] = ImageIO.read(new File("src/culminating/2.jpg"));
		pics[17] = ImageIO.read(new File("src/culminating/3.jpg"));
		pics[18] = ImageIO.read(new File("src/culminating/4.png"));
		pics[19] = ImageIO.read(new File("src/culminating/5.jpg"));
		pics[20] = ImageIO.read(new File("src/culminating/6.jpg"));
		pics[21] = ImageIO.read(new File("src/culminating/7.jpg"));
		pics[22] = ImageIO.read(new File("src/culminating/8.jpg"));
		pics[23] = ImageIO.read(new File("src/culminating/9.jpg"));
		pics[24] = ImageIO.read(new File("src/culminating/10.jpg"));
		pics[25] = ImageIO.read(new File("src/culminating/11.png"));
		pics[26] = ImageIO.read(new File("src/culminating/12.jpg"));
		pics[27] = ImageIO.read(new File("src/culminating/13.png"));
		pics[28] = ImageIO.read(new File("src/culminating/14.jpg"));
		pics[29] = ImageIO.read(new File("src/culminating/cards.jpg"));
	}
	
		public static void drawBoard(boolean[] matched) throws IOException{
			Point[] coords = new Point[14];
			coords[0] = new Point(247, 110);
			coords[1] = new Point(317, 110);
			coords[2] = new Point(387, 110);
			coords[3] = new Point(457, 110);
			coords[4] = new Point(527, 110);
			coords[5] = new Point(247, 210);
			coords[6] = new Point(317, 210);
			coords[7] = new Point(387, 210);
			coords[8] = new Point(457, 210);
			coords[9] = new Point(527, 210);
			coords[10] = new Point(247, 110);
			coords[11] = new Point(317, 110);
			coords[12] = new Point(387, 110);
			coords[13] = new Point(4576, 110);
			
			//board
			c.drawImage(pics[29], 200, 100, null);
			c.drawImage(pics[15], 247, 110, 20, 20, c);
			c.drawImage(pics[16], 317, 110, 20, 20, c);
			c.drawImage(pics[17], 387, 110, 20, 20, c);
			c.drawImage(pics[18], 457, 110, 20, 20, c);
			c.drawImage(pics[19], 527, 110, 20, 20, c);
			c.drawImage(pics[20], 247, 210, 20, 20, c);
			c.drawImage(pics[21], 317, 210, 20, 20, c);
			c.drawImage(pics[22], 387, 210, 20, 20, c);
			c.drawImage(pics[23], 457, 210, 20, 20, c);
			c.drawImage(pics[24], 527, 210, 20, 20, c);
			c.drawImage(pics[25], 247, 310, 20, 20, c);
			c.drawImage(pics[26], 317, 310, 20, 20, c);
			c.drawImage(pics[27], 387, 310, 20, 20, c);
			c.drawImage(pics[28], 457, 310, 20, 20, c);	
			
			//flips cards that are matched
			for(int i = 0; i < 14; i++){
				if(matched[i])
					flipCard(coords, i);
					
			}
		
		}
	


	public static void main(String[] args) throws IOException, InterruptedException {

		boolean[] matched= new boolean[14];
		String done;
		int answer1;
		int answer2;

		loadImages();

		c.println("Time To Match");
		Thread.sleep(100);
		c.clear();
		c.drawImage(pics[14], 200, 100, null);

		//shuffle

		for (int i=0; i<10000; i++){
			int random1= (int)((Math.random()*14));
			int random2= (int)((Math.random()*14));

			BufferedImage temp = pics[random1];
			pics[random1]= pics [random2];
			pics [random2]= temp;
		}

		drawBoard(matched);
		
		//Get answer from user

		do{
			c.println("type 2 numbers that you think match");
			boolean flag= false;
			do{
				flag= false;
				answer1=c.readInt();
				if(matched[answer1-1]){
					flag=true;
					c.print("Already Written");
				}
			}while(flag);

			do{
				flag= false;
				answer2=c.readInt();
				if(matched[answer2-1]){
					flag=true;
					c.print("Already Written");
				}
			}while(flag);

			//Matching

			if (pics[answer1-1].equals(pics[answer2-1])){
				c.drawImage(pics[answer1-1], 50, 300, 80, 100, c);				
				c.drawImage(pics[answer2-1], 150, 300, 80, 100, c);
				matched[answer1-1] = true;
				matched[answer2-1] = true;
				c.println("MATCH");
			}
			else{
				c.println("Wrong");
				c.drawImage(pics[answer1-1], 50, 300, 80, 100, c);
				c.drawImage(pics[answer2-1], 150, 300, 80, 100, c);
			}

			Thread.sleep(5000);
			c.clear();

			drawBoard(matched);
			
			c.println("Retry?Type retry\nContinue?Type anything");
			done=c.readLine();

		}while(!done.equals("retry"));
	}

}
