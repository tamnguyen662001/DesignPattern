package FactoryPattern;

public class mainFactory {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.createShape(ShapeType.Rectangle);

        // ShapeFactory shapeFactoryy = new ShapeFactory();
        // Shape shape2 = shapeFactoryy.createShape(ShapeType.Rectangle);
        // System.out.println(shape2.draw("Blue222", "A3", "Plastic"));

        System.out.println(shape1.draw("Blue", "A3", "Plastic"));
        shape1 = shapeFactory.createShape(ShapeType.Circle);
        System.out.println(shape1.draw("Red", "A4", "Plastic"));
        shape1 = shapeFactory.createShape(ShapeType.Triangle);
        System.out.println(shape1.draw("Yellow","A3","Paper"));
    }
}
