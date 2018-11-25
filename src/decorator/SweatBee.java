package decorator;

public class SweatBee extends GenericBee implements Bee {
    public void specialAbility() {
        System.out.println("Increased health attribute!");
    }
}
