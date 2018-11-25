package builder;

public class Room {
    private int length;
    private int width;
    private String name;
    
    /**
     *  Room class that will inserted into a Beehive.
     *  @author Steven Treadway (streadw2)
     */
    public Room(String name, int len, int wdth) {
        this.setName(name);
        this.setLength(len);
        this.setWidth(wdth);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
