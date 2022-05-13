package ChainOfRepos3;

public class ChangeElectricMoneyMin implements IChangeElectricMoney {
    IChangeElectricMoney successor;
    String label;
    int min;
    int count;
    float total;
    double price;
    

    

    public ChangeElectricMoneyMin(String label, int min, double price) {
        this.label = label;
        this.min = min;
        this.price = price;
    }

    @Override
    public float Change(int money) {
       

        if (money >= min) {
            count = money - min;
            total =  (float) ((float)count * this.price);
            
           
           System.out.println(this.label + " : " + count);
            if (money > 0) {
                return successor.Change(money);
            }
            return  total;
        } else
            return successor.Change(money);

    }

    @Override
    public IChangeElectricMoney setSuccessor(IChangeElectricMoney money) {

        this.successor = money;
        return money;
    }

}