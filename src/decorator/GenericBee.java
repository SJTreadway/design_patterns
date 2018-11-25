package decorator;

public class GenericBee implements Bee {
    private String gender, role, name;
    private int age;
    private BeeType type;
    
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
                System.out.println("Harvest nectar speed increased!");
                break;
            case CARPENTER:
                System.out.println("Work 1.5X longer than other bees!");
                break;
            case SWEAT:
                System.out.println("Takes 1.25X more damage than other bees!");
                break;
            default:
                System.out.println("No special attribute for this type of bee.");
        }
    }
}
