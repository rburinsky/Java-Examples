package MB2_Updated;

public class DuelEmpire extends DuelCombatants {

  

    public DuelEmpire(String name, String description, int health) {
    
    	super(name, description, health);
    
    	
    }
    public String toString(){
        return "Empire Combatant Name: " + super.getName()  + ", " + super.getDescription() + ", health value is: " + super.getHealth();
    }

}