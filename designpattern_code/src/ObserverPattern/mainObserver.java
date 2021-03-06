package ObserverPattern;

public class mainObserver {
    public static void main(String[] args) {
        Exchangerate t = new Exchangerate();
    
        BusinessmanA DTA = new BusinessmanA(t);
        BusinessmanB DTB = new BusinessmanB(t);
        System.out.println("Time 1: ");
        t.notifyExchangerate(5);
        System.out.println("=======================");
        DTA.cancel();
        DTB.updateExchangerate(-29);
        System.out.println("Time 2: ");
        t.notifyExchangerate(19);
    }
}
