package builder;

import java.util.HashMap;
import java.util.Map;

/**
 *  Beehive class that implements Builder design pattern.
 *  @author Steven Treadway (streadw2)
 */

public class Beehive {
    
    private Map<Integer, Room> rooms;

    public Map<Integer, Room> getRooms() {
        return rooms;
    }
    
    public boolean isEmpty() {
        return rooms.size() == 0;
    }
    
    public int numRooms() {
        return rooms.size();
    }
    
    public void addRoom(Room room) {
        this.rooms.put(rooms.size() + 1, room);
    }
    
    private Beehive(BeehiveBuilder builder) {
        this.rooms = builder.rooms;
    }
    
    //Builder Class
    public static class BeehiveBuilder {
        
        private Map<Integer, Room> rooms = new HashMap<>();
        
        public BeehiveBuilder(Room room) {
            this.rooms.put(rooms.size() + 1, room);
        }
        
        public Beehive build() {
            return new Beehive(this);
        }

    }

}
