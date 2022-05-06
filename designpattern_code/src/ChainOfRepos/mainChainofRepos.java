package ChainOfRepos;

public class mainChainofRepos {
    public static void main(String[] args) {
        Iranking F = new RankingMin("Rank F",0);
        Iranking E = new RankingMin("Rank E", 4);
        Iranking D = new RankingMin("Rank D", 6);
        Iranking C = new RankingMin("Rank C", 8);
        Iranking B = new RankingMin("Rank B", 9);
        Iranking A = new RankingMin("Rank A", 10);

        A.setSuccessor(B).setSuccessor(C)
        .setSuccessor(D).setSuccessor(E).setSuccessor(F);

        System.out.println("Mark : 9.8 --- Ranking : " + A.Ranking((float)9.8));
        System.out.println("Mark : 5.6 --- Ranking : " + A.Ranking((float)5.6));
        System.out.println("Mark : 8.9 --- Ranking : " + A.Ranking((float)8.9));
        System.out.println("Mark : 1.3 --- Ranking : " + A.Ranking((float)1.8));

        
    }
}
