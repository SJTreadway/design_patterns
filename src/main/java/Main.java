package main.java;

import builder.Beehive;
import builder.Beehive.BeehiveBuilder;
import builder.Room;
import decorator.BumbleBee;
import decorator.CarpenterBee;
import decorator.HoneyBee;
import decorator.SweatBee;
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
        System.out.println("BeehiveBuilder created, containing " + room.getName() 
                + " with these dimensions: " + room.getLength() + "x" + room.getWidth());
        
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
        
        System.out.println("Creating a HoneyBee, BumbleBee, CarpenterBee, and SweatBee...");
        
        System.out.print("\nSpecial Ability for each type of Bee: \n");
        
        HoneyBee honeybee = new HoneyBee("Honey Bee 1","male","harvester",3);
        honeybee.specialAbility();
        
        BumbleBee bumblebee = new BumbleBee("Bumble Bee 1","male","fighter",5);
        bumblebee.specialAbility();
        
        CarpenterBee carpenterbee = new CarpenterBee("Carpenter Bee 1","female","worker",2);
        carpenterbee.specialAbility();
        
        SweatBee sweatbee = new SweatBee("Sweat Bee 1","female","worker",1);
        sweatbee.specialAbility();

        System.out.println("------------------------------------------------------\n\n");
        
        // STRATEGY Design Pattern
        System.out.println("---------------Strategy design pattern----------------");
        
        System.out.print("List of actions for each type of Bee: \n");
        honeybee.performAction();
        bumblebee.performAction();
        carpenterbee.performAction();
        sweatbee.performAction();
        System.out.println("------------------------------------------------------");
        
    }
}
