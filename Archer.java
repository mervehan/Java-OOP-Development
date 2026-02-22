import java.util.Random;
public class Archer extends Warrior { 
	
private int criticalChance; 

 private  Random rng = new Random();
	
	public Archer (String name,int health,int baseDamage,int criticalChance ) {
		super(name,health,baseDamage);
		this.criticalChance = Math.min(Math.max(criticalChance, 0), 50);
	}
		@Override
		public void showInfo() {
	        System.out.println("Archer: " + name + " -- Health: " + health
	                + " -- Base Damage: " + baseDamage + " -- Critical Chance: " + criticalChance + "%");
	    }
		@Override
		public int attack(int targetDefense) {
	        double dmg = baseDamage - targetDefense;
	        boolean isCritical = (rng.nextInt(50) < criticalChance); 
	        if (isCritical) { 
	            dmg = dmg * 2; 
	        }
	        int result = (int) Math.round(dmg);
	        return Math.max(result, 0);
	    }
}
