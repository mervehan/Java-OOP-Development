# Java-OOP-Development
# Hero RPG System (Java OOP Practice)

This is a Java project I developed for my Object-Oriented Programming course. It’s a combat simulation where different hero types (like Knights and Mages) fight in an arena. My main goal was to practice how different classes can share features while having their own unique combat logic.

## 🛠️ What I Implemented

### 1. Object-Oriented Logic
* **Inheritance:** I created a base class called `Warrior` to keep common traits like health and name in one place.
* **Polymorphism:** Even though they are all "Warriors," each hero (Knight, Mage, Archer) attacks differently. I used method overriding to handle these unique behaviors.
* **Member Hiding:** I specifically used the Knight class to practice variable shadowing, which was an interesting challenge in the assignment.

### 2. Combat & Damage Formulas
I wrote specific math formulas for each hero to make the game feel balanced:
* **Knight:** High defense and physical power.
* **Mage:** Strong magic attacks but depends on mana.
* **Archer:** Has a special "Critical Hit" chance that can double the damage.

### 3. Error Handling (Try-Catch)
I wanted the program to be "crash-proof," so I added strict rules for user input:
* It checks if the defense value is a valid number (prevents text input errors).
* It throws an error if the user enters a negative number or a value over 100.

## 🚀 How to Play
1. Run the `Main.java` file.
2. The program will show you the stats of the heroes.
3. You will be asked to enter a "Defense Value" to see how much damage each hero deals to an enemy.
