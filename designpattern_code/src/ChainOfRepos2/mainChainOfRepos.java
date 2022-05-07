package ChainOfRepos2;

public class mainChainOfRepos {
    public static void main(String[] args) {
        IChangeMoney mottram = new ChangeMoneyMin("Menh gia 100",100);
        IChangeMoney haitram = new ChangeMoneyMin("Menh gia 200", 200);
        IChangeMoney namtram = new ChangeMoneyMin("Menh gia 500", 500);

        namtram.setSuccessor(haitram).setSuccessor(mottram);

        System.out.println( namtram.Change(1700));
        // System.out.println("200 VND --- Doi tien: " + haitram.Change(2300));
        // System.out.println("100 VND --- Doi tien: " + mottram.Change(2300));

    }
        
}
