
public class Inventory {
	
	private boolean log,stone ,rock;
	private String weaponName, armorName;
	private int damage, armor;
	
	Inventory() {
		this.log = false;
		this.stone = false;
		this.rock = false;
		this.damage = 0;
		this.armor = 0;
		this.weaponName = null;
		this.armorName = null;
	}

	public boolean isLog() {
		return log;
	}

	public void setLog(boolean log) {
		this.log = log;
	}

	public boolean isStone() {
		return stone;
	}

	public void setStone(boolean stone) {
		this.stone = stone;
	}

	public boolean isRock() {
		return rock;
	}

	public void setRock(boolean rock) {
		this.rock = rock;
	}

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public String getArmorName() {
		return armorName;
	}

	public void setArmorName(String armorName) {
		this.armorName = armorName;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

}
