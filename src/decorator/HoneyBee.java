package decorator;

import java.util.HashMap;
import java.util.Map;

import strategy.BeeAction;

public class HoneyBee extends GenericBee implements Bee, BeeAction {
    private static final Map<String, Integer> attributes;
    static {
        attributes = new HashMap<String, Integer>();
        attributes.put("fighting", 1);
        attributes.put("stamina", 4);
        attributes.put("health", 2);
        attributes.put("harvesting", 5);
    }
    
    public HoneyBee(String name, String gender, String role, int age) {
        super(name, gender, role, age, BeeType.HONEY, attributes);
    }
    
    public void specialAbility() {
        System.out.println("Increased harvesting attribute!");
    }
    
    public void performAction() {
        System.out.println("You have decided to harvest!");
    }
}
