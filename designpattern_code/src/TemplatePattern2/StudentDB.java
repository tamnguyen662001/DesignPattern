package TemplatePattern2;

public class StudentDB extends EntityDB<Students> {

    @Override
    protected int getKey(Students t) {
       return t.id;
    }


    @Override
    public void display1(Students t ) {
       System.out.println("address: " + t.address + ", age: " + t.age + ", id: " + t.id + ", name: " + t.name);
        
    }
    
}
