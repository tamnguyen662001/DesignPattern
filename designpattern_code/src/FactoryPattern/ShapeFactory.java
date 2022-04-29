package FactoryPattern;

public class ShapeFactory{
    public Shape createShape(ShapeType shapeType){
        Shape shape = null;
        switch(shapeType){
            case Rectangle:
                shape = new Rectangle();
                break;
            case Triangle:
                shape = new Triangle();
                break;
            case Circle:
                shape = new Circle();
                break;
        }
        return shape;
    }
}
