package ChainOfRepos3;

public class ChangeElectricMoneyMin implements IChangeElectricMoney {
    IChangeElectricMoney successor;
    String label;
    int min;
    int count;
    float total = 0;
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
            total +=  (float) ((float)this.min * this.price);
            
           System.out.println(count);
           System.out.println(this.label + " : " + count);
           System.out.println(total);
            if (money > 0) {
                return successor.Change(money);
            }
            return  total;
        } else
            return successor.Change(money);

    }
// ,mau thiêt ke
    @Override
    public IChangeElectricMoney setSuccessor(IChangeElectricMoney money) {

        this.successor = money;
        return money;
    }

}