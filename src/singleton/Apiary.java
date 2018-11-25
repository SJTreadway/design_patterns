package singleton;

/**
 * 
 * @author Steven Treadway (streadw2)
 * description: Apiary class is based on the Singleton design pattern.
 */

public class Apiary {
    private static Apiary instance = null;
    
    private Apiary() {}
    
    public static Apiary getInstance() {
       if (instance == null) {
          instance = new Apiary();
       }
       return instance;
    }
}
