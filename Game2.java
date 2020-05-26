import java.util.Random;
import java.util.Scanner;


public class Game2 {
	public static void main(String[] args) {
		
		//System objects
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		//Game variables
		String[] enemies = {"Satan","Beezelbub","Leviathan","Beast"};
		int maxEnemyHealth = 100;
		int maxEnemyDamage = 25;
		
		//Player variables
		int maxPlayerHealth = 100;
		int maxPlayerDamage = 35;
		int portionBottles = 3;
		int portionHealthAmount = 25;
		int portionLossChances = 50; //50% chance of losing portion when attacking
		boolean running = true;
		
		System.out.println("Welcome to the remnants of Earth.");
		
		GAMEPLAY:
			while(running) {
				System.out.println("----------------------------------");
				int enemyHealth = rand.nextInt(maxEnemyHealth);
				String enemy = enemies[rand.nextInt(enemies.length)];
				System.out.println("\t#Your first foe is "+enemy+"\nThis enemy begins with "+enemyHealth+" health rating.\n");
						
				while(enemyHealth>0) {
					System.out.println("\tYour HP: "+maxPlayerHealth);
					System.out.println("\t"+enemy+" HP is: "+enemyHealth);
					System.out.println("\n\tWhat would you like to do?");
					System.out.println("\t1. Attack!");
					System.out.println("\t2. Drink Health Potion");
					System.out.println("\t3. Run!");
					
					String input = in.nextLine();
					if(input.equals("1")) {
						int damageDealt = rand.nextInt(maxPlayerDamage);
						int damageTaken = rand.nextInt(maxEnemyDamage);
						enemyHealth -= damageDealt;
						maxPlayerHealth -= damageTaken;
						System.out.println("\t> You just attacked "+enemy+ " with "+damageDealt+" damage.");
						System.out.println("\t> You received "+damageTaken+" damage in retaliation.");
						
						if(maxPlayerHealth<1) {
							System.out.println("\t> You're out of health points and are dead as a doornail. Game over dude.");
							break;
						}
					} else if(input.equals("2")) {
						if(portionBottles>0) {
							maxPlayerHealth+=portionHealthAmount;
							portionBottles--;
							System.out.println("\t> You drank a health potion, healing yourself for "+portionHealthAmount+" ."
												+ "\n\t> You know have "+maxPlayerHealth+" HP>."
												+ "\n\t> You have "+portionBottles+" portion bottles left.\n");
						} else {
								System.out.println("\t> Sorry, you're out of health potions. Defeat enemies for a chance to get one");
							}
				
					} else if (input.equals("3")) {
						System.out.println("\t> You've run away from the "+enemy+"!");
						continue GAMEPLAY;
					} else {
						System.out.println("\t> Invalid command. Please try again(1-3)");
					}

				}
				
				if (maxPlayerHealth<1) {
					System.out.println("You have been banned from earth, your corpse shipped away via remote capsule. ");
					break;
				} 
				
				System.out.println("----------------------------------");
				System.out.println(" # "+enemy+" was defeated! #");
				System.out.println(" # You have "+maxPlayerHealth+" health points remaining.");
				if (rand.nextInt(100) < portionLossChances) {
					portionBottles++;
					System.out.println(" # The "+enemy+" dropped a health potion # ");
					System.out.println(" # You have "+portionBottles+" bottle(s) of health potion left. # ");
				}
				
				System.out.println("----------------------------------");
				System.out.println(" # What would you like to do?");
				System.out.println(" # 1.Continue Fighting");
				System.out.println(" # 2.Leave Earth Permanently");
				
				String input = in.nextLine();
				while (!input.equals("1") && !input.equals("2")) {
					System.out.println("Invalid command");
					input = in.nextLine();
				}
				
				if(input.equals("1")) {
					System.out.println("Ah, continuing your adventure!");
				} else if (input.equals("2")) {
					System.out.println(" *** Congratulations on your success. You leave earth a crowned knight of the veil ***");
					break;
				}	
			}
		
		System.out.println("");
		System.out.println("##############################");
		System.out.println("#### THANKS FOR PLAYING!  ####");
		System.out.println("###############################");

	} 
}
