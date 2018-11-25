package decorator;

public class GenericBee {
    private String gender, role, name;
    private int age;
    private BeeType type;
    private Object attributes; // fighting, stamina, health, harvesting
    
    public GenericBee (String gender, String role, String name, 
            int age, BeeType type, Object attributes) {
        this.setGender(gender);
        this.setRole(role);
        this.setName(name);
        this.setAge(age);
        this.setType(type);
        this.setAttributes(attributes);
    }
    
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

    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }
}
