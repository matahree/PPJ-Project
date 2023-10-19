import java.util.Scanner;

public class Player {
	
	private int damage, healthy, money, rHealthy;
	private String pName, cName;
	private Inventory inventory;
	Scanner scan = new	Scanner(System.in);
	
	public int getDamage() {
		return damage;
	}
	public void selectCharacter() {
		switch(characterMenu()) {
		case 1:
			initializePlayer("Samurai", 4,20,16);
			break;
		case 2:
			initializePlayer("Archer", 6,17,18);
			break;
		case 3:
			initializePlayer("Paladin", 7,21,11);
			break;
		case 4:
			initializePlayer("Pikeman", 3,19,7);
			break;
		default:	
			initializePlayer("Samurai", 4,20,16);
			break;
			
		}
		System.out.println("Character: "+  getcName() + " , Damage: " + getDamage() + ", Health: " + getHealthy() + ", Money: " + getMoney());
	}
	public int characterMenu() {
		System.out.println("Please select a character!");
		System.out.println("1- Character's name: \t Samurai \t  Damage: 4 \t Health: 20 \t Money: 16");
		System.out.println("2- Character's name: \t Archer \t  Damage: 6 \t Health: 17 \t Money: 18");
		System.out.println("3- Character's name: \t Paladin \t  Damage: 7 \t Health: 21 \t Money: 11");
		System.out.println("4- Character's name: \t Pikeman \t  Damage: 3 \t Health: 19 \t Money: 7");
		System.out.println("");
		int characterID = scan.nextInt();
		
		while (characterID < 1 || characterID > 4 ) {
			System.out.print("Please! Enter a number 1 to 4! ");
			characterID = scan.nextInt();
		}
		
		return characterID;
	}
	public int getTotalDamage() {
		return this.getDamage()+ this.getInventory().getDamage();
	}
	public void initializePlayer(String cName, int damage, int healthy, int money) {
		
		setcName(cName);
		setDamage(damage);
		setHealthy(healthy);
		setMoney(money);
		setrHealthy(healthy);
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Player(String pName) {
		this.pName = pName;
		this.inventory = new Inventory();
	}
	public int getrHealthy() {
		return rHealthy;
	}
	public void setrHealthy(int rHealthy) {
		this.rHealthy = rHealthy;
	}
	

}
