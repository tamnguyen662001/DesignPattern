package DecoratorPattern;

public abstract class Beverage {
    public String description;
    public abstract int cost();


    
    public Beverage(String description) {
        this.description = description;
    }


    public String getDescription() {
        return this.description;
    }



  
    
    
}
