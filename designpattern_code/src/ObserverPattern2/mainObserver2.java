package ObserverPattern2;

public class mainObserver2 {
    public static void main(String[] args) {
        
        ATM atm = new ATM();
        ATM atm1 = new ATM();
        Account A =  new Account("Nguyen Minh Phuc", 100, atm);
        Account B =  new Account("Tran Van Long", 200, atm1);
        System.out.println("Giao dich lan 1 : ");
        A.nhapATM();
        B.nhapATM();
        atm.rutTien(40);
        atm1.rutTien(5);
        System.out.println("Giao dich lan 2 : ");
        atm1.rutTien(90);

        A.rutATM();
        System.out.println("Giao dich lan 3 : ");
        atm.rutTien(20);
        atm1.rutTien(10);
    }
}
