package ChainOfRepos2;

public interface IChangeMoney {
    IChangeMoney setSuccessor (IChangeMoney money);
    int Change (int money);
}
