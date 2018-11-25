package builder;

public class Room {
    private int length, width;
    private String name;
    
    public Room (String name, int len, int wdth) {
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
