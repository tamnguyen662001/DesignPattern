package ObserverPattern;

public class mainObserver {
    public static void main(String[] args) {
        Exchangerate t = new Exchangerate();
    
        BusinessmanA DTA = new BusinessmanA(t);
        BusinessmanB DTB = new BusinessmanB(t);
        System.out.println("Time 1: ");
        t.notifyTiGia(5);
        System.out.println("=======================");
        DTA.cancel();
        System.out.println("Time 2: ");
        t.notifyTiGia(19);
    }
}
