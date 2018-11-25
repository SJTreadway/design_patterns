package decorator;

import java.util.Map;

public class GenericBee {
    private String gender, role, name;
    private int age;
    private BeeType type;
    private Map<String, Integer> attributes; // fighting, stamina, health, harvesting
    
    public GenericBee (String name, String gender, String role, 
            int age, BeeType type, Map<String, Integer> attributes) {
        this.setGender(gender);
        this.setRole(role);
        this.setName(name);
        this.setAge(age);
        this.setType(type);
        this.attributes = attributes;
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
    
    public Map<String, Integer> getAttributes() {
        return attributes;
    }

    public int getAttribute(String key) {
        return attributes.get(key);
    }
}
