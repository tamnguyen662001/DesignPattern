package ChainOfRepos2;

public class mainChainOfRepos {
    public static void main(String[] args) {
        IChangeMoney mottram = new ChangeMoneyMin("Menh gia 100",100);
        IChangeMoney haitram = new ChangeMoneyMin("Menh gia 200", 200);
        IChangeMoney namtram = new ChangeMoneyMin("Menh gia 500", 500);
        IChangeMoney namchuc  = new ChangeMoneyMin("Menh gia 50", 50);
        IChangeMoney haichuc = new ChangeMoneyMin("Menh gia 20", 20);
        IChangeMoney muoi = new ChangeMoneyMin("Menh gia 10", 10);
        IChangeMoney nam = new ChangeMoneyMin("Menh gia 5",5) ;
        IChangeMoney hai = new ChangeMoneyMin("Menh gia 2",2) ;
        IChangeMoney mot = new ChangeMoneyMin("Menh gia 1",1) ;

            
        

        namtram.setSuccessor(haitram)
                .setSuccessor(mottram).setSuccessor(namchuc)
                .setSuccessor(haichuc).setSuccessor(muoi)
                .setSuccessor(nam).setSuccessor(hai).setSuccessor(mot);

        
        System.out.println( namtram.Change(777));
        

    }
        
}
