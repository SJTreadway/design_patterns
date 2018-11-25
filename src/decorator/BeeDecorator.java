package decorator;

public class BeeDecorator implements Bee {
    protected Bee bee;
    
    public BeeDecorator(Bee b){
        this.bee = b;
    }
    
    @Override
    public void specialAbility() {
        this.bee.specialAbility();
    }
}
