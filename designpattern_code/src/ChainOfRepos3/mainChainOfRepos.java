package ChainOfRepos3;

public class mainChainOfRepos {
    public static void main(String[] args) {
        IChangeElectricMoney bac1 = new ChangeElectricMoneyMin("Bac 1",50,1.678);
        IChangeElectricMoney bac2 = new ChangeElectricMoneyMin("Bac 2",49,1.734);
        IChangeElectricMoney bac3 = new ChangeElectricMoneyMin("Bac 3",99, 2.014);
        IChangeElectricMoney bac4 = new ChangeElectricMoneyMin("Bac 4",99, 2.536);
        IChangeElectricMoney bac5 = new ChangeElectricMoneyMin("Bac 5",99,2.834);
        IChangeElectricMoney bac6 = new ChangeElectricMoneyMin("Bac 6",99,2.2927);
    
        bac6.setSuccessor(bac5).setSuccessor(bac4).setSuccessor(bac3).setSuccessor(bac2).setSuccessor(bac1);

        System.out.println( bac6.Change(300));
        // System.out.println("===================================");
        // System.out.println( bac6.Change(1283));
    }

}
