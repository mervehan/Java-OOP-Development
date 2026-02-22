
public class Knight extends Warrior {
	
protected String name;
private int armorPower; 

public Knight(String name,int health,int baseDamage,int armorPower) {
	super(name,health,baseDamage);
	this.name=name;
	this.armorPower=armorPower;	
}

@Override
public void showInfo() {
	 System.out.println("Knight (hidden name): " + this.name + " -- (super.name): " + super.name
             + " -- Health: " + health + " -- Base Damage: " + baseDamage + " -- ArmorPower: " + armorPower);
}
@Override 
public int attack(int targetDefense) {
    double extra = armorPower * 0.2; 
    double dmg = (baseDamage + extra) - targetDefense;
    int result = (int) Math.round(dmg);
    return Math.max(result, 0);
}

}
