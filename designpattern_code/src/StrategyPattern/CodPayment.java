package StrategyPattern;

public class CodPayment implements IPayment{

    @Override
    public double Payment(int money) {
        if(money > 2000000)
            return money-money*0.2;
        return money;
    }
    
}
