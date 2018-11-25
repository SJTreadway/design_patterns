package decorator;

public class GenericBee implements Bee {
    private String gender, role, name;
    private int age;
    private BeeType type;
    private Object attributes; // fighting, stamina, health, harvesting
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public BeeType getType() {
        return type;
    }
    
    public void setType(BeeType type) {
        this.type = type;
    }
    
    public void specialAbility() {
        switch (this.type) {
            case HONEY:
                System.out.println("Increased fighting attribute!");
                break;
            case BUMBLE:
                System.out.println("Increased harvesting attribute!");
                break;
            case CARPENTER:
                System.out.println("Increased stamina attribute!");
                break;
            case SWEAT:
                System.out.println("Increased health attribute!");
                break;
            default:
                System.out.println("No special attribute for this type of bee.");
        }
    }

    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }
}
