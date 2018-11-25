package decorator;

public class BumbleBee extends GenericBee implements Bee {
    public void specialAbility() {
        System.out.println("Increased fighting attribute!");
    }
}
