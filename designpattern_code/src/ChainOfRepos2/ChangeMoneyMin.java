package ChainOfRepos2;

public class ChangeMoneyMin implements IChangeMoney {
    IChangeMoney successor;
    String label;
    int min;
    int count;

    public ChangeMoneyMin(String label, int min) {

        this.label = label;
        this.min = min;
    }

    @Override
    public int Change(int money) {

        if (money >= min) {
            count = money / min;
            money = money - min * count;
            System.out.println(this.label + " : " + count);
            if (money > 0) {
                return successor.Change(money);
            }
            return count;
        } else {

            if (successor != null)
                return successor.Change(money);
            else
                return count;
        }

    }

    @Override
    public IChangeMoney setSuccessor(IChangeMoney money) {

        this.successor = money;
        return money;
    }

}
