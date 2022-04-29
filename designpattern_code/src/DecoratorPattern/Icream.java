package DecoratorPattern;

public class Icream extends CondimentDecorator {

    public Icream(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public int cost() {
        return beverage.cost()+8000;
    }
    
}
