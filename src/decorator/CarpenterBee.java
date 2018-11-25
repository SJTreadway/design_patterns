package decorator;

public class CarpenterBee extends GenericBee implements Bee {
    public void specialAbility() {
        System.out.println("Increased stamina attribute!");
    }
}
