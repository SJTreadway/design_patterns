package main.java;

import builder.Beehive;
import builder.Beehive.BeehiveBuilder;
import builder.Room;
import singleton.Apiary;

public class Main {
    /**
     * Main class that runs each of our design pattern packages.
     * @author - Steven Treadway (streadw2)
     */
    public static void main(final String[] args) {
        
        // SINGLETON Design Pattern
        System.out.println("---------------Singleton design pattern---------------");
        Apiary apiary = Apiary.getInstance();
        System.out.println("apiary1 = Apiary.getInstance()");
        Apiary apiary2 = Apiary.getInstance();
        System.out.println("apiary2 = Apiary.getInstance()");
        System.out.print("Are these two apiary vars equal? ");
        System.out.print(apiary == apiary2);
        System.out.println("\n------------------------------------------------------\n\n");
        
        // BUILDER Design Pattern
        System.out.println("---------------Builder design pattern-----------------");
        Room room = new Room("Main Room", 50, 60);
        BeehiveBuilder bhb = new BeehiveBuilder(room);
        System.out.println("BeehiveBuilder created, containing " + room.getName() + " with these dimensions: " 
        + room.getLength() + "x" + room.getWidth());
        Beehive bh = bhb.build();
        System.out.println("How many rooms does our beehive contain? " + bh.numRooms());
        Room room2 = new Room("Game Room", 25, 20);
        System.out.println("Game Room created with these dimensions: " 
        + room2.getLength() + "x" + room2.getWidth());
        System.out.println("Adding Game Room to our Beehive...");
        bh.addRoom(room2);
        System.out.println("How many rooms does our beehive contain? " + bh.numRooms());
        System.out.println("------------------------------------------------------\n\n");
        
        // DECORATOR Design Pattern
        System.out.println("---------------Decorator design pattern---------------");
        
        System.out.println("------------------------------------------------------\n\n");
        
        // STRATEGY Design Pattern
        System.out.println("---------------Strategy design pattern----------------");
        
        System.out.println("------------------------------------------------------");
        
    }
}
