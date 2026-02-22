import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Knight k=new Knight("Valerian",180,40,30);
		Mage  m= new Mage("Aethon",120,45,25);
		Archer a=new Archer("Zephyr",80,20,50);
		
		System.out.println("--Warrior's Informantion--");
		k.showInfo();
        m.showInfo();
        a.showInfo();
        
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a target defense's value: ");
		String input=scan.nextLine();
		
		try {
            
            int targetDefense = Integer.parseInt(input.trim());
            if (targetDefense < 0) {
                throw new IllegalArgumentException("Target defense cannot be negative.");
            }

            if (targetDefense > 100) {
                throw new RuntimeException("Such a high defense value is not allowed!");
            }
           
            System.out.println("\n***Attack Results***(targetDefense = " + targetDefense + ") ");
            System.out.println("Knight dealt damage: " + k.attack(targetDefense));
            System.out.println("Mage   dealt damage: " + m.attack(targetDefense));
            System.out.println("Archer dealt damage: " + a.attack(targetDefense));

            
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid input: Please enter an integer. Error: " + nfe.getMessage());
        } catch (IllegalArgumentException iae) {
            System.out.println("Error (IllegalArgument): " + iae.getMessage());
        } catch (RuntimeException re) {
            System.out.println("Error (RuntimeException): " + re.getMessage());
        } finally { 
            scan.close(); 
        }
		
	}

}
