
public class Blacksmith extends SafeLocation{

	Blacksmith(Player player) {
		super(player, "Store");
		
	}
	
	public boolean getLocation() {
		System.out.println("Money " + player.getMoney());
		System.out.println("1- Weapons ");
		System.out.println("2- Armors ");
		System.out.println("3- Exit! ");
		System.out.println("You chose: ");
		int Blacksmith = scan.nextInt();
		int selectItem;
		switch(Blacksmith) {
		case 1:
			selectItem = weaponMenu();
			buyWeapon(selectItem);
			break;
		case 2:
			selectItem = armorMenu();
			buyArmor(selectItem);
			break;
		default:
			break;
		}
		
		return true;
	}
	public int armorMenu() {
		System.out.println("1- Helmet\t #Price: 12, Damage Prevention: 1");
		System.out.println("2- Sabaton\t #Price: 20, Damage Prevention: 3");
		System.out.println("3- Thornmail\t #Price: 37, Damage Prevention: 5");
		System.out.println("4- Exit!");
		int selectArmorID = scan.nextInt();
		return selectArmorID;
	}
	
	public void buyArmor(int selectItemID) {
		
		int prevention = 0, price =0;
		String armorName = null;
		switch(selectItemID) {
		case 1:
			prevention= 1;
			armorName = "Helmet";
			price = 12;
			break;
		case 2:
			prevention= 3;
			armorName = "Sabaton";
			price = 20;
			break;
		case 3:
			prevention= 5;
			armorName = "Thornmail";
			price = 37;
			break;
		case 4:
			System.out.println("Logout from the store...");
			break;
		default:
			System.out.println("Invalid transaction!");
			break;
		}
		
		if(price> 0 ) {
			if(player.getMoney() >= price) {
				player.getInventory().setArmor(prevention);
				player.getInventory().setArmorName(armorName);
				player.setMoney(player.getMoney()-price);
				System.out.println("You bought " + armorName + " Blocked Damage " + player.getInventory().getArmor());
				System.out.println("Available balance: " + player.getMoney());
			}else {
				System.out.println("Your money is insufficient!");
			}
		}
	}
	
	public int weaponMenu() {
		System.out.println("1- Deagle\t #Price: 20, Damage: 3");
		System.out.println("2- BattleAxe\t #Price: 38, Damage: 4");
		System.out.println("3- Katana\t #Price: 50, Damage: 7");
		System.out.println("4- Exit!");
		int selectWeaponID = scan.nextInt();
		return selectWeaponID;
	}
	public void buyWeapon(int selectItemID) {
		int damage = 0, price =0;
		String weaponName = null;
		switch(selectItemID) {
		case 1:
			damage= 3;
			weaponName = "Deagle";
			price = 20;
			break;
		case 2:
			damage= 4;
			weaponName = "BattleAxe";
			price = 38;
			break;
		case 3:
			damage= 7;
			weaponName = "Katana";
			price = 50;
			break;
		case 4:
			System.out.println("Logout from the store...");
			break;
		default:
			System.out.println("Invalid transaction!");
			break;
		}
		
		if(price> 0 ) {
			if(player.getMoney() > price) {
				player.getInventory().setDamage(damage);
				player.getInventory().setWeaponName(weaponName);
				player.setMoney(player.getMoney()-price);
				System.out.println("You bought " + weaponName + " Previous damage: " +player.getDamage()+ 
						" New damage: " + player.getTotalDamage());
				System.out.println("Available balance" + player.getMoney());
			}else {
				System.out.println("Your money is insufficient!");
			}
		}
		
		
	}

}
