package FactoryPattern;

public class Rectangle  extends Shape{
    private static Rectangle instance;

    protected Rectangle() {
    }

    public static Rectangle createInstance(){
        if(instance == null)
            instance = new Rectangle();
        return instance;
    }
    
    
    @Override
    String draw(String brush, String paper, String frame) {
        return "Rectangle: " + " " + brush + " " + paper + " " + frame;
    }
}
