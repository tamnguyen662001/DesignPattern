package DecoratorPattern;

public class Coffee extends Beverage {

    public Coffee(String description) {
        super(description);
    }
    
    @Override
    public int cost() {
        return 15000;
    }
    
}
