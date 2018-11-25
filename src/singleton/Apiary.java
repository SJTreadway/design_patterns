package singleton;

/**
 * Apiary class is based on the Singleton design pattern.
 * @author Steven Treadway (streadw2)
 */

public class Apiary {
    private static Apiary instance = null;
    
    private Apiary() {}
    
    /**
     * Method to get our Apiary instance or create a new one if doesn't exist.
     * @return instance
     */
    public static Apiary getInstance() {
        if (instance == null) {
            instance = new Apiary();
        }
        return instance;
    }
}
