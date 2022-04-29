package FactoryPattern;

public class Triangle extends Shape{
    private static Circle instance;

    protected Triangle() {
    }
// thiết lập singleton cho triangle
    public static Circle createInstance(){
        if(instance == null)
            instance = new Circle();
        return instance;
    }
    @Override
    String draw(String brush, String paper, String frame) {
        return "Triangle: " + brush + " " + paper + " " + frame;
    }
    
}
