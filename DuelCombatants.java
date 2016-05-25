package MB2_Updated;

import java.util.Random;

public class DuelCombatants {

	
	//combatant name, health, description
	private String name;
    private String description;
	private int health;
	
	//Start and end fight
	private String objectmessage = "Todays combatants: \n";
	private String objectmessage2 = "The duel will now begin! Fight! \n";
	private String objectmessageend = "The duel has ended!\n";
	
	//Default Constructor used for messages no parameters
	public DuelCombatants(){
		
	}
	
	
	
	
	//Constructor takes name, description, health
	public DuelCombatants(String n, String d, int h) {
		this.name = n;
		this.description = d;
		this.health = h;
	    }
	
	
	
	
	
	//Getters and setters for each combatant name, health, description
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getHealth() {
		return health;
	}



	public void setHealth(int health) {
		this.health = health;
	}


	
	
	//toString all combatant parameters
	public String toString(){
        return "Name :"+getName() + ", " + getDescription() + ", health value is: " + getHealth();
	}
	


	
	
	
	//Getters and Setters for Fight Start/Stop
	public String getObjectmessage() {
		return objectmessage;
	}





	public void setObjectmessage(String objectmessage) {
		this.objectmessage = objectmessage;
	}





	public String getObjectmessage2() {
		return objectmessage2;
	}





	public void setObjectmessage2(String objectmessage2) {
		this.objectmessage2 = objectmessage2;
	}





	public String getObjectmessageend() {
		return objectmessageend;
	}





	public void setObjectmessageend(String objectmessageend) {
		this.objectmessageend = objectmessageend;
	}




//Dice rolling game method

	int roll (int numberOfRolls, int numberOfDice, String name) {
        int singleScore = 0;
        int score = 0;
        String attacker = name;
        
        // Construct a Random class instance
        Random randomGen = new Random();


        // roll the dices
        for (int i = 0; i < numberOfRolls; i++) {
            System.out.print(attacker + " hits: " + attack());
           
            for (int j = 0; j < numberOfDice; j++) {
                // between 1 and 6-inclusive
                singleScore = randomGen.nextInt(6) + 1;
                System.out.print(" " + singleScore + "  ");               
                score += singleScore;
            } // end of a single dice roll
            System.out.println();
        } // end of all rolls
        return score;     
    } 

//Random method for attack type used in roll()
public String attack(){
	final String[] proper_noun = {"Force Lightning", "Lightsaber Slash", "Force Choke", "Lightsaber Strike", "Force Push", "Lightsaber Attack", "Mind Crush"};
	Random random = new Random();
	int index = random.nextInt(proper_noun.length);
	String strike = proper_noun[index];
	
	return strike;
	
}




}
