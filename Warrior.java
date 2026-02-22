import java.util.Random;
import java.util.Scanner;

public class Warrior {
	protected String name; 
	protected int health;
	protected int baseDamage;
	
	public Warrior(String name,int health, int baseDamage) {
		if(health<1 || health>200) {
			throw new  IllegalArgumentException("Health must be between 1 and 200.");
		}
		this.name=name;
		this.health=health;
		this.baseDamage=baseDamage;
	}
	
	public void showInfo() {
		  System.out.println("Warrior: " + name + " -- Health: " + health + " -- Base Damage: " + baseDamage);
	}
	
	 public int attack(int targetDefense) {
	        return baseDamage - targetDefense;
	    }
}
