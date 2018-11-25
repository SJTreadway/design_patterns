package builder;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author steventreadway
 * description: Beehive class that implements Builder design pattern.
 *
 */

public class Beehive {
    
    private Map<Integer, Room> rooms;

    public Map<Integer, Room> getRooms() {
        return rooms;
    }
    
    private Beehive (BeehiveBuilder builder) {
        this.rooms = builder.rooms;
    }
    
    //Builder Class
    public static class BeehiveBuilder{
        
        private Map<Integer, Room> rooms = new HashMap<>();
        
        public BeehiveBuilder(Room room){
            this.rooms.put(rooms.size() + 1, room);
        }
        
        public Beehive build(){
            return new Beehive(this);
        }

    }

}
