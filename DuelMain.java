package MB2_Updated;







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
