package ChainOfRepos3;

public class mainChainOfRepos {
    public static void main(String[] args) {
        IChangeElectricMoney bac1 = new ChangeElectricMoneyMin("Bac 1",50,1);
        IChangeElectricMoney bac2 = new ChangeElectricMoneyMin("Bac 2",99,2);
        IChangeElectricMoney bac3 = new ChangeElectricMoneyMin("Bac 3",189, 3);
        IChangeElectricMoney bac4 = new ChangeElectricMoneyMin("Bac 4",297, 4);
        IChangeElectricMoney bac5 = new ChangeElectricMoneyMin("Bac 5",396,5);
        IChangeElectricMoney bac6 = new ChangeElectricMoneyMin("Bac 6",401,6);
    
        // bac6.setSuccessor(bac5).setSuccessor(bac4).setSuccessor(bac3).setSuccessor(bac2).setSuccessor(bac1);
        bac1.setSuccessor(bac2).setSuccessor(bac3).setSuccessor(bac4)
.setSuccessor(bac5).setSuccessor(bac6)     ;
   System.out.println( bac6.Change(100));
        // System.out.println("===================================");
        // System.out.println( bac6.Change(1283));
    }

}
