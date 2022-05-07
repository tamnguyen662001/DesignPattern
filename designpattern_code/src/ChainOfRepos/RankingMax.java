package ChainOfRepos;

public class RankingMax implements Iranking {
    String label;
    float max ;

    public RankingMax(String label, float max) {
        this.label = label;
        this.max = max;
    }

    @Override // kiem tra diem co hop le hay k thoi 
    public String Ranking(float mark) {
        if (mark <= max)
            return label;
        return "Can't ranking!";
    }

    @Override // do la coa nhat k ai quan li nen tra ve null
    public Iranking setSuccessor(Iranking rank) {

        return null;
    }

}
