package StrategyPattern;

public class mainStrategy {
    public static void main(String[] args) {
        Cart Cart = new Cart();

        System.out.println("Cart 1: \n");
        Cart.getList().add(new Product("Nokia X5","New product in 2022",910000));
        Cart.getList().add(new Product("Samsung","Samsung Galaxy A21",3080000));
        Cart.setTypePayment(new OnlinePayment());
        Cart.display();
        System.out.println(Cart.Payment());
        System.out.println("\n");



        System.out.println("Cart 2: \n");
        Cart Cart1 = new Cart();
        Cart1.getList().add(new Product("Oppo","Oppo Renno 7 5G",1500000));
        Cart1.getList().add(new Product("Realme","Realme Q5 Pro",4800000));
        Cart1.setTypePayment(new CodPayment());
        Cart1.display();
        System.out.println(Cart1.Payment());
    }
}
