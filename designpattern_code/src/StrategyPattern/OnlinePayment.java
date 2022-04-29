package StrategyPattern;

public class OnlinePayment implements IPayment{

    @Override
    public double Payment(int money) {
        if(money < 1000000)
            return money - money*0.5;
        return money - money * 0.7;
    }
    
}
