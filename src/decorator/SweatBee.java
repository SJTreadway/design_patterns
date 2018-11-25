package decorator;

import java.util.HashMap;
import java.util.Map;

import strategy.BeeAction;

public class SweatBee extends GenericBee implements Bee, BeeAction {
    private static final Map<String, Integer> attributes;
    
    static {
        attributes = new HashMap<String, Integer>();
        attributes.put("fighting", 2);
        attributes.put("stamina", 2);
        attributes.put("health", 5);
        attributes.put("harvesting", 4);
    }
    
    public SweatBee(String name, String gender, String role, int age) {
        super(name, gender, role, age, BeeType.SWEAT, attributes);
    }
    
    public void specialAbility() {
        System.out.println("The SweatBee's special ability is an increased health attribute!");
    }
    
    public void performAction() {
        System.out.println("The SweatBee's responsibility is to out live all of the other bees!");
    }
}
