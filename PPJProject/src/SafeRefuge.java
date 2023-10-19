
public class SafeRefuge extends SafeLocation {

	SafeRefuge(Player player ) {
		super(player, "Safe Refuge");
		
	}
	public boolean getLocation() {
		player.setHealthy(player.getrHealthy());
		System.out.println("You recovered!");
		System.out.println("You are in the Safe Refuge right now! ");
		return true;
	}

}
