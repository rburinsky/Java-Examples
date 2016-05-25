package MB2_Updated;



/*
Randy Burinsky CMIS242
MB2: The super keyword

What does the super keyword represents and where can it be used? 
Give an example of a superclass and subclass. Be sure to make all 
the instances variables of the super class private. Include at 
least one constructor in each class and ensure that the constructor 
of the subclass calls the constructor of the superclass. 
Also include a toString method in both classes that returns 
the values of the instance variables with appropriate labels. 
Ensure that the toString method of subclass calls the toString method 
of the superclass so that the string returned contains the values of 
all the inherited instance variables.

*/




public class DuelMain {

	public static void main(String[] args) {
		
		//Assign values combatants by using inheritance through DuelEmpire.java
		DuelEmpire Empire1 = new DuelEmpire("Palpatine", "The Evil Emperor", 10);
		DuelEmpire Empire2 = new DuelEmpire("Darth Vader", "Lord of the Sith", 10);
		
		//Set up objects for messages 
		DuelCombatants objMessage = new DuelCombatants();
	     System.out.println(objMessage.getObjectmessage());
		
		//Combatants for DuelEmpire.java
		System.out.println(Empire1.toString() + "\n");
        System.out.println(Empire2.toString() + "\n");
        
        System.out.println(objMessage.getObjectmessage2());
        
        //Start game
        //Set up game variables
        String Combatant1 = Empire1.getName();
        String Combatant2 = Empire2.getName();
        String Combatantd1 = Empire1.getDescription();
        String Combatantd2 = Empire2.getDescription();
        
        int scoreCombatant1 = 0;
        int scoreCombatant2 = 0;
        int healthCombatant1 = 10;
        int healthCombatant2 = 10;
       
        //Call method DuelCombatants.roll()
        
        
        do{
        	scoreCombatant1 = Empire1.roll(1, 1, Combatant1);
            scoreCombatant2 = Empire2.roll(1, 1, Combatant2);
        	
        	healthCombatant1 = healthCombatant1 - scoreCombatant2;
        	healthCombatant2 = healthCombatant2 - scoreCombatant1;
        
        }while(healthCombatant1 >= 1 || healthCombatant2 >= 1);
        
        if (healthCombatant1 > healthCombatant2){
        	System.out.println("");
        	System.out.println(Combatant1 + ", " + Combatantd1 + "," + " have defeated " + Combatant2);
        	
        }else{
        	System.out.println("");
        	System.out.println(Combatant2 + ", " + Combatantd2 + "," + " have defeated " + Combatant1);
        }
        	
        }
        
        
   }


