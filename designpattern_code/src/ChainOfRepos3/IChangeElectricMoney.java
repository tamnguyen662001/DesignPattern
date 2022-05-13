package ChainOfRepos3;

public interface IChangeElectricMoney {
    IChangeElectricMoney setSuccessor (IChangeElectricMoney money);
    float Change (int money);
}
