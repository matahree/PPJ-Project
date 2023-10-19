import java.util.Random;

public class Monsters {
	
	private String name;
	private int damage,loot,health, MaxNnumber;
	public Monsters(String name, int damage,  int health, int loot, int maxNnumber) {
	
		this.name = name;
		this.damage = damage;
		this.loot = loot;
		this.health = health;
		MaxNnumber = maxNnumber;
	}
	public int numberOfMonster() {
		Random ran = new Random();
		return ran.nextInt(this.MaxNnumber) +1;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getLoot() {
		return loot;
	}
	public void setLoot(int loot) {
		this.loot = loot;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getMaxNnumber() {
		return MaxNnumber;
	}
	public void setMaxNnumber(int maxNnumber) {
		MaxNnumber = maxNnumber;
	}
	

	

}
