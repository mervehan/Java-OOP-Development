
public class Mage extends Warrior {

	private int mana;
	
	public Mage(String name,int health,int baseDamage,int mana) {
		super(name,health,baseDamage);
		this.mana=mana;
	}
	
	@Override 
	public void showInfo() {
		 System.out.println("Mage: " + name + " -- Health: " + health
	                + " -- Base Damage: " + baseDamage + " -- Mana: " + mana);
	}
	@Override 
	public int attack(int targetDefense) {
		double extra=mana/2.0; 
		double dmg=(baseDamage + extra)-targetDefense;
		int result=(int)Math.round(dmg);
		return Math.max(result, 0);
		
		
	}
}
