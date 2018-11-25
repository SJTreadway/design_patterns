package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import builder.Beehive;
import builder.Room;
import builder.Beehive.BeehiveBuilder;

public class BeehiveTests {
    Room room = new Room("Main Room", 50, 60);
    BeehiveBuilder bhb = new BeehiveBuilder(room);
    Beehive bh = bhb.build();
    
    @Test
    public void testNumRooms() {
        assertTrue(bh.numRooms() == 1);
    }
    
    @Test
    public void testAddRoom() {
        Room room = new Room("Game Room", 50, 60);
        bh.addRoom(room);
        assertTrue(bh.numRooms() == 2);
    }
    
    @Test
    public void testEmptyBehive() {
        assertFalse(bh.isEmpty());
    }

}
