package ObserverPattern3;

public class mainObserver3 {
    public static void main(String[] args) {
        
        Office x  = new Office();
        Topic y = new Topic("Day la topic 1");
        MemberA memberA = new MemberA("Member A");
        x.attach(memberA);
        x.addTopic(y);
        memberA.updateTopic("hfsfds");
        
    }
}
