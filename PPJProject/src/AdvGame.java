import java.util.Scanner;

public class AdvGame {
	
	Player player;
	Location location;
	Scanner scan = new Scanner(System.in);
	
	public void login() {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to the Adventure Game!");
			System.out.println("Enter your name: ");
			String playerName = scan.nextLine();
			
			player = new Player("");
			player.selectCharacter();
			start();
	}
	public void start() {
		 while(true) {
			 System.out.println();
			 System.out.println("###############################################");
			 System.out.println("###############################################");
			 System.out.println();
			 System.out.println("Where would you like to go?");
			 System.out.println("1- Safe Refuge => There is no enemy! ");
			 System.out.println("2- Enchanted Forest ");
			 System.out.println("3- Lava Region ");
			 System.out.println("4- Hollow ");
			 System.out.println("5- Store => You can buy weapon and armor! ");
			 System.out.println("6- Swamp ");
			 System.out.println("The area you want to go to: ");
			 int selectLocation = scan.nextInt();
			 while(selectLocation < 0 || selectLocation >6 ) {
				 System.out.println("Please! Enter a number 1 to 6! ");
				 selectLocation = scan.nextInt();
			 }
			 
			 switch (selectLocation) {
			 case 1:
				 location = new SafeRefuge(player);
				 break;
			 case 2:
				 location = new EnchantedForest(player);
				 break;
			 case 3:
				 location = new LavaRegion(player);
				 break;
			 case 4:
				 location = new Hollow(player);
				 break;
			 case 5:
				 location = new Blacksmith(player);
				 break;
			 case 6:
				 location = new Swamp(player);
				 break;
			default:
				 location = new SafeRefuge(player);
			 }
			 if(location.getClass().getName().equals("SafeRefuge")) {
				 if(player.getInventory().isLog() && player.getInventory().isRock() && player.getInventory().isStone()) {
					 System.out.println("Congratulations! You won the game!");
					 break;
				 }
				 
			 }
			 if(!location.getLocation()) {
				 System.out.println("Game Over!");
				 break;
			 }
		 }
	}

}
