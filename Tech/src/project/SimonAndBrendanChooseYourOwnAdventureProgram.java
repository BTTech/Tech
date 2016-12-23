/* SimonAndBrendansChooseYourOwnAdventureProgram.java
 * gives a table of a number given by the user to the power of another number
 * Simon Cadieux, Brendan Trinh
 * December 13 2016
 */
package project;
// Brendan worked on lines 271 - 348, added all picture and fixed the program
//Simon worked on the rest of the program
import java.util.Scanner;
import hsa_new.Console;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SimonAndBrendanChooseYourOwnAdventureProgram {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Console c = new Console(45,150);
		

		boolean corect1 = false;
		boolean corect2 = false;
		boolean cont = true;
		String[] inventory = new String[7];
		int ia = 0;
		int ib = 0;
		int secDoor;
		int inb;
		String[] equipment= {"drill","batarang","batmobile","teargas,'jetpack"};
		try {
			BufferedImage[] pics = new BufferedImage[27];
			try {
				pics[0] = ImageIO.read(new File("src/project/Batman Failed copy.jpg"));
				pics[1] = ImageIO.read(new File("src/project/clock entrance.jpg"));
				pics[2] = ImageIO.read(new File("src/project/Coin.jpg"));
				pics[3] = ImageIO.read(new File("src/project/crossroads copy.jpg"));
				pics[4] = ImageIO.read(new File("src/project/Fair.jpg"));
				pics[5] = ImageIO.read(new File("src/project/Haunted Hotel.jpg"));
				pics[6] = ImageIO.read(new File("src/project/hole with clowns copy.jpg"));
				pics[7] = ImageIO.read(new File("HouseAtNight.jpg"));
				pics[8] = ImageIO.read(new File("src/project/Inside Tent clowns watching copy.jpg"));
				pics[9] = ImageIO.read(new File("src/project/Batman Mansion.jpg"));
				pics[10] = ImageIO.read(new File("src/project/Inside Tent death scene copy.jpg"));
				pics[11] = ImageIO.read(new File("src/project/KillerClowns copy.jpg"));
				pics[12] = ImageIO.read(new File("src/project/ManBeingKilledByKirito copy.jpg"));
				pics[13] = ImageIO.read(new File("src/project/ManInFearDieingByBayblades copy.jpg"));
				pics[14] = ImageIO.read(new File("src/project/Out Side Tent blood scene copy.jpg"));
				pics[15] = ImageIO.read(new File("src/project/Out Side Tent.jpg"));
				pics[16] = ImageIO.read(new File("src/project/running away ending.jpg"));
				pics[17] = ImageIO.read(new File("src/project/Scary Hallway.jpg"));
				pics[18] = ImageIO.read(new File("src/project/Scary HallwayQuestions anime copy.jpg"));
				pics[19] = ImageIO.read(new File("src/project/Scary HallwayQuestions Bayblade or SAO copy.jpg"));
				pics[20] = ImageIO.read(new File("src/project/ScarySlenderman copy.jpg"));
				pics[21] = ImageIO.read(new File("src/project/Teargas Fail copy.jpg"));
				pics[22] = ImageIO.read(new File("src/project/weapon room copy.jpg"));
				pics[23] = ImageIO.read(new File("src/project/wile e coyote jet pack fail gif.gif"));
				pics[24] = ImageIO.read(new File("src/project/zombues copy.jpg"));
				pics[25] = ImageIO.read(new File("src/project/ScaryForest.jpg"));
				pics[26] = ImageIO.read(new File("src/project/running away with bat mobile.jpeg"));
				
			//use c.drawImage(pics[0-17], 20, 0, null); to place pictures it is already configured :)
			
			//Clip music = AudioSystem.getClip();
			//music.open(AudioSystem.getAudioInputStream(new File("")));
			//use music.start(); to play music and music.stop(); to end it

			} catch (IOException e) {
				e.printStackTrace();
			}

			while(cont == true){
				c.drawImage(pics[7], 20, 0, null);
				c.println("On Halloween your friend ask you if you want to go to the fair.\n(yes/no)");
				String in = c.readLine();

				if(in.equals("yes")){
					c.println("You notice a file lying on your desk\nit might be useful do you take it with you\n(yes/no)");
					in = c.readLine();

					if(in.equals("yes")){
						inventory[2] = "File";
						c.println("You take the file and carry on your way.");
						Thread.sleep(1000);
					}
					c.clear();
					c.drawImage(pics[4], 20, 0, null);
					c.println("You go to the fair with your friend and have a fun time playing games.\n");
					c.println("Near the end of the night you and your friend come across a tend that wasn't\n there earlier your friend enters the tent do you follow?\n(yes/no)");
					in = c.readLine();
					
					c.drawImage(pics[15], 20, 0, null);
					if(in.equals("yes")){
						c.clear();
						c.drawImage(pics[8], 20, 0, null);
						c.println("You enter the tent and you realise that there were a bunch of clowns.\nThey had stoped what they were doing and are stareing right at you\nDo you run?\n(yes/no)");
						in = c.readLine();

						if(in.equals("yes")){
							c.clear();
							c.drawImage(pics[3], 20, 0, null);
							c.println("As you are running away from the clowns you come across a forest to your right\nand an abandond hotel to your left what do you do?\n(left/right)");
							in = c.readLine();

							if(in.equals("right")){
								c.clear();
								c.drawImage(pics[25], 20, 0, null);
								c.println("You enter the Forest\n as you are running through the forest you hear the clowns closing in. You also see a man standing in the forest do you run towards him or run away\n(towards/away)");
								in = c.readLine();
								c.drawImage(pics[11], 20, 0, null);
								if(in.equals("Away")){
									c.clear();
									c.drawImage(pics[11], 20, 0, null);
									c.println("You run away from the man only to be caught and killed by clowns");
								}
								else{
									c.clear();
									c.drawImage(pics[20], 20, 0, null);
									c.println("As you aproach him you realize that he has no features on his face.\nby the time you realized, it was to late he turned around and you were killed By Slenderman");

								}
							}
							else{
								c.clear();
								c.drawImage(pics[5], 20, 0, null);
								c.clear();
								c.drawImage(pics[2], 20, 0, null);
								c.println("Inside the hotel you find a toonie and a paper clip on the ground with a note beside it\nRead the note?\n(yes/no)");
								in = c.readLine();

								if(in.equals("yes")){
									c.clear();
									c.drawImage(pics[17], 20, 0, null);
									c.println("The note reads:\nFlip the coin at the entrance heads to go right, tails to go left\nTake the Items?\n(yes/no)");
									in=c.readLine();

									if(in.equals("yes")){
										c.clear();
										c.drawImage(pics[17], 20, 0, null);
										c.println("You pick up the coin and enter the Hotel.\n the hallway goes left and right.\nWhich way?\n(left/right)");
										inventory[1] = "Paperclip";

										if(Math.random()>0.5){
											c.clear();
											c.println("You flip the coin...");
											Thread.sleep(1000);
											c.print("It lands on heads you go to the right");
											Thread.sleep(1000);
											c.clear();
											c.drawImage(pics[17], 20, 0, null);
											c.println("You come to a door its locked\nDo you try to pick the lock?\n(yes/no)");
											in= c.readLine();

											if(in.equals("yes")){
												c.clear();
												c.drawImage(pics[17], 20, 0, null);
												if(inventory[1].equals("Paperclip")&&inventory[2].equals("File")){
													c.println("You unfold the paper clip and take out your file to pick the lock.\nYou have three tries to pick the lock to do so you have to solve an equation");
													for(int i = 0; i<3; i++){
														c.println("11.4x(10^5)x0.12");
														inb = c.readInt();

														if(inb == 136800){
															i = 4;
															ia = 4;
															corect1 = true;
														}

													}
													if(ia==4){
														c.println("You got through the door entered the next room/nthere is a key pad with 20 numbers on it\nGuess the number");
														secDoor = (int)(Math.random()*20)+1;
														for(int i = 0; i<3; i++){
															inb = c.readInt();

															if(inb == secDoor){
																i = 4;
																ib = 4;
																c.println("You guessed the right number\nThe door opens and you enter the next room");
																Thread.sleep(1000);
															}
														}
														if(ia == 4 && ib == 4){
															c.clear();
															c.drawImage(pics[16], 20, 0, null);
															c.println("You get through the door and escape into the night\nlate the next day...\nyou switch to the news only to see that the clowns you escaped had killed a hundred people last night");
															Thread.sleep(1000);

														}
														else{
															c.clear();
															in = scan.nextLine();
															c.drawImage(pics[11], 20, 0, null);
															c.println("You failed to guess the number in time\nthe clowns broke in and killed you");
															Thread.sleep(1000);
														}
													}
													else{
														c.clear();
														in = scan.nextLine();
														c.drawImage(pics[11], 20, 0, null);
														c.println("You took to long to pick the lock the clowns broke in and Killed You");
														Thread.sleep(1000);
													}

												}
												else{
													c.clear();
													c.drawImage(pics[11], 20, 0, null);
													c.println("You look around to find something to pick the lock\nYou find nothing but the paperclip you picked up earlier\nThe clowns break in and Kill You");
													Thread.sleep(1000);
												}

											}
										}
										else{
											c.clear();
											c.drawImage(pics[2], 20, 0, null);
											c.println("You flip the coin...");
											Thread.sleep(1000);
											c.println("It lands on tails you go to the left");
											Thread.sleep(1000);
											c.clear();
											c.drawImage(pics[18], 20, 0, null);
											c.println("You go down the hallway you come to a sign with arrows it asks:\nWould you rather anime or real life?\n(anime/life)");
											in = c.readLine();

											if(in.equals("anime")){
												c.clear();
												c.drawImage(pics[19], 20, 0, null);
												c.println("you walk through the door marked anime\nyou come to another sign it says:\nSAO or Bayblade?\n(SAO/Bayblade)");
												in= c.readLine();

												if(in.equals("SAO")){
													c.clear();
													c.drawImage(pics[13], 20, 0, null);
													c.println("You go into the room marked SAO\nBayblades fly out from the walls and Kill You :)");
													Thread.sleep(1000);
												}
												else{
													c.clear();
													c.drawImage(pics[12], 20, 0, null);
													c.println("You walk into the room marked Bayblade\nStanding in the room is Kirito and he rushes at you and Kills You :)");
													Thread.sleep(1000);
												}

											}
											else{
												c.clear();
												c.drawImage(pics[11], 20, 0, null);
												c.println("You go down the hallway marked as life but you were too slow and the clowns caught up and killed you.");
												Thread.sleep(1000);
											}
										}
									}
									else{
										c.clear();
										c.drawImage(pics[11], 20, 0, null);
										c.println("You leave the coin and enter the mantion the hallway goes left and right\nYou took to long to decide and the clowns killed you.");
										Thread.sleep(1000);
									}
								}
								else{
									c.clear();
									c.drawImage(pics[11], 20, 0, null);
									c.println("You leave the coin and enter the mantion the hallway goes left and right\nYou took to long to decide and the clowns killed you.");
									Thread.sleep(1000);
								}
							}
						}
						else{
							c.clear();
							c.drawImage(pics[10], 20, 0, null);
							c.println("You Decide to stay and try to fight the clowns\nYou are quicly overwelmed and Killed.");
							Thread.sleep(1000);
						}
					}
					else{
						c.println("You hear screaming from the tent and blood splatters onto the tent.\nWhat do you do?.\n(run/check)");
						in=c.readLine();
						c.clear();
						if (in.equals("run")){
							int random= (int)(Math.random()*100)+1;

							if (random<=30){
								c.println("Your dead.");
							}
							else if (random>=31) {
								c.println("You run into a crossroad.\n Which way do go.\n(left/right)");
								in=c.readLine();
								c.drawImage(pics[3], 20, 0, null);
								c.clear();
							
								if (in.equals("left")){
									c.drawImage(pics[24], 20, 0, null);
									c.println("Your enter a graveyard and you get overwelmed by zombies and you die");
									c.clear();
								}
								else if(in.equals("right")){
									c.drawImage(pics[9], 20, 0, null);
									c.println("You find a mansion.\nDo you enter.\n(yes/no");
									in=c.readLine();
									c.clear();
									
									if (in.equals("no")){
										c.drawImage(pics[11], 20, 0, null);
										c.println("You run into the clowns and die.");
										c.clear();
									}
									else if (in.equals("yes")){
										c.drawImage(pics[1], 20, 0, null);
										c.clear();
										c.println("you find a cave behind a clock in the mansion and find equipment.\n Which do you choose.\n(drill/batarang/batmobile/teargas/jetpack");
										in=c.readLine();
										c.drawImage(pics[22], 20, 0, null);
										c.clear();
										if (in.equals("drill")){
										c.println("What did you think would happen?");
										c.drawImage(pics[6], 20, 0, null);
										}
										else if (in.equals("batarang")){
											c.println("Really?");
											c.drawImage(pics[0], 20, 0, null);
										}
										else if (in.equals("batmobile")){
											c.println("You escape the clowns using the batmobile.\n YAY");
											c.drawImage(pics[26], 20, 0, null);
										}
										else if (in.equals("teargas")){
											c.println("Nice job.");
											c.drawImage(pics[21], 20, 0, null);
										}
										else if (in.equals("jetpack")){
											c.println("Just like in the movies.");
											c.drawImage(pics[23], 20, 0, null);
										}
									
										}
									}
								}
								
							}
					}
				}
				else{
					c.clear();
					c.drawImage(pics[7], 20, 0, null);
					c.println("You tell your friend that you didn't want to go and you ended up staying home.\n The next day you see on the news that Killer Clowns killed your friend last night at the Fair.\n YOU SURVIVED\n play again?\n (yes/no)");
					in = scan.nextLine();

					if(in.equals("no")){
						cont = false;
					}
				}
				c.clear();
				c.println("play again?\n (yes/no)");
				String end = scan.nextLine();

				if(in.equals("no")){
					cont = false;
				}

				
				in = "";
				Thread.sleep(1000);
			}
			Thread.sleep(1000);
			c.close();



		} catch (InterruptedException e) {

		}
	}
}

