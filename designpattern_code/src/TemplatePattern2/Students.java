package TemplatePattern2;

public class Students {
    int id;
    String name, address;
    int age;
    public Students(int id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Students [address=" + address + ", age=" + age + ", id=" + id + ", name=" + name + "]";
    }
    
 
    
}
