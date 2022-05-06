package ChainOfRepos;

public class RankingMin implements Iranking {
    Iranking successor;
    String label;
    float min;

    public RankingMin(String label, float min) {

        this.label = label;
        this.min = min;
    }

    @Override
    public String Ranking(float mark) {
        if (mark >= min)
            return label;
        else {
            if (successor != null)
                return successor.Ranking(mark);
            return "Can't ranking!";
        }
    }

    @Override
    public Iranking setSuccessor(Iranking rank) {
        this.successor = rank;
        return rank;
    }

}
