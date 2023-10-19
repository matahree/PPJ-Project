
public abstract class WarfareLocation extends Location{
	protected Monsters monsters;
	protected String Loot;
	
	WarfareLocation(Player player, String name, Monsters monsters, String Loot) {
		super(player);
		this.monsters = monsters;
		this.name = name;
		this.Loot = Loot;
	}
	
	public boolean 	getLocation() {
		int monstersCount= monsters.numberOfMonster();
		System.out.println("You are in the " + this.getName() + " right now.");
		System.out.println("There are " + monstersCount + " unit(s) "+ monsters.getName()+ ". Be careful!");
		System.out.print("|F|ight or |R|un: ");
		String selectCase = scan.nextLine();
		selectCase = selectCase.toUpperCase();
		if(selectCase.equals("F")) {
			if(battle(monstersCount)) {
				
				System.out.println("You killed all the enemies in the "+ this.getName() + "!");
				if(this.Loot.equals("stone") && player.getInventory().isStone() ==false) {
					System.out.println("You got " + this.Loot);
					player.getInventory().setStone(true);
				}else if(this.Loot.equals("rock") && player.getInventory().isRock() ==false) {
					System.out.println("You got " + this.Loot);
					player.getInventory().setRock(true);
				}else if(this.Loot.equals("log") && player.getInventory().isLog() ==false) {
					System.out.println("You got " + this.Loot);
					player.getInventory().setLog(true);
				}
	
				return true;
			} 
			if(player.getHealthy() <= 0) {
				System.out.println("You died!");
				return false;
			}
		}
			
		return true;
	}
	public boolean battle(int monstersCount) {
		for(int m=0; m<monstersCount; m++) {
			int defaultMonstersHealth= monsters.getHealth();
			playerStatistic();
			enemyStatistic();
			while(player.getHealthy() > 0 && monsters.getHealth()> 0 ) {
				System.out.print("|A|ttack or |R|un: ");
				String selectCase = scan.nextLine();
				selectCase = selectCase.toUpperCase();
				if(selectCase.equals("A")){
					System.out.println("You attacked the enemy! ");
					monsters.setHealth(monsters.getHealth()-player.getTotalDamage());
					afterAttack();
					if(monsters.getHealth()<=0 ) {
						System.out.println("#####################################");
						System.out.println("The beast attacked you! ");
						player.setHealthy(player.getHealthy()- (monsters.getDamage()- player.getInventory().getArmor()));
						afterAttack();
					}
					
					
				}else {
					return false;
				}
			}
			if(monsters.getHealth() < player.getHealthy()) {
				System.out.println("You killed the enemy!");
				player.setMoney(player.getMoney() + monsters.getLoot());
				System.out.println("Your total money: " + player.getMoney());
				monsters.setHealth(defaultMonstersHealth);
				
				
			}else {
				return false;
			}
			System.out.println("###########################");
		}
		return true;
	}
	public void playerStatistic() {
		System.out.println("Player Statistic:\n################## ");
		System.out.println("Health: " + player.getHealthy());
		System.out.println("Damage: " + player.getTotalDamage());
		System.out.println("Money: " + player.getMoney());
		
		if(player.getInventory().getDamage() > 0) {
			System.out.println("Weapon: " + player.getInventory().getWeaponName());
		}
		if(player.getInventory().getArmor() > 0) {
			System.out.println("Armor: " + player.getInventory().getArmorName());
		}
	}
	public void enemyStatistic() {
		System.out.println(monsters.getName()+ " Statistic:\n##################");
		System.out.println("Health: " + monsters.getHealth());
		System.out.println("Damage: " + monsters.getDamage());
		System.out.println("Loot: " + monsters.getLoot());
	}
	
	public void afterAttack() {
		System.out.println("Player Health: " + player.getHealthy());
		System.out.println(monsters.getName()+ " Health: " + monsters.getHealth());
		System.out.println();
	}

}
