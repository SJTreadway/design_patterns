package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import builder.Room;

public class RoomTests {

    @Test
    public void testRoomCreation() {
        Room room = new Room("Main Room", 50, 60);
        assertTrue(room.getLength() == 50);
        assertTrue(room.getWidth() == 60);
        assertTrue(room.getName() == "Main Room");
    }

}
