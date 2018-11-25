package decorator;

/**
 * BeeDecorator class is based on the Decorator design pattern.
 * @author Steven Treadway (streadw2)
 */

public class BeeDecorator implements Bee {
    protected Bee bee;
    
    public BeeDecorator(Bee b) {
        this.bee = b;
    }
    
    @Override
    public void specialAbility() {
        this.bee.specialAbility();
    }
}
