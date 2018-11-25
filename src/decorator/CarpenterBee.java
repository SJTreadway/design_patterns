package decorator;

import java.util.HashMap;
import java.util.Map;

public class CarpenterBee extends GenericBee implements Bee {
    private static final Map<String, Integer> attributes;
    static {
        attributes = new HashMap<String, Integer>();
        attributes.put("fighting", 3);
        attributes.put("stamina", 5);
        attributes.put("health", 4);
        attributes.put("harvesting", 2);
    }
    
    public CarpenterBee(String name, String gender, String role, int age) {
        super(name, gender, role, age, BeeType.CARPENTER, attributes);
    }
    
    public void specialAbility() {
        System.out.println("Increased stamina attribute!");
    }
}
