package FactoryPattern;

public class Circle extends Shape{

    private static Circle instance;

    protected Circle() {
    }
// thiết lập singleton cho circle
    public static Circle createInstance(){
        if(instance == null)
            instance = new Circle();
        return instance;
    }
    @Override
    String draw(String brush, String paper, String frame) {
        return "Circle: " + brush + " " + paper + " " + frame;
    }
    
}
