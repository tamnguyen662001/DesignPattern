package DecoratorPattern;

public class mainDecorator {
    public static void main(String[] args) {
        Beverage beverage = new Coffee("Coffee");
        beverage = new Milk("Milk", beverage);
        beverage = new Icream("Icream", beverage);
        System.out.println("Description : "+ beverage.getDescription());
        System.out.println("Price : " + beverage.cost());
    }
}
