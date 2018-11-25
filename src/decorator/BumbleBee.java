package decorator;

import java.util.HashMap;
import java.util.Map;

import strategy.BeeAction;

public class BumbleBee extends GenericBee implements Bee, BeeAction {
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
        System.out.println("The BumbleBee's special ability is an increased fighting attribute!");
    }
    
    public void performAction() {
        System.out.println("The BumbleBee's responsibility is to fight!");
    }
}
