package decorator;

import java.util.HashMap;
import java.util.Map;

public class BumbleBee extends GenericBee implements Bee {
    private static final Map<String, Integer> attributes;
    static {
        attributes = new HashMap<String, Integer>();
        attributes.put("fighting", 5);
        attributes.put("stamina", 3);
        attributes.put("health", 3);
        attributes.put("harvesting", 1);
    }
    
    public BumbleBee(String name, String gender, String role, int age) {
        super(name, gender, role, age, BeeType.BUMBLE, attributes);
    }

    public void specialAbility() {
        System.out.println("Increased fighting attribute!");
    }
}
