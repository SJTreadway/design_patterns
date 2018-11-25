package decorator;

public class HoneyBee extends GenericBee implements Bee {
    public void specialAbility() {
        System.out.println("Increased harvesting attribute!");
    }
}
