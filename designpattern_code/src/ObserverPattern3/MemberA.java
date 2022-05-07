package ObserverPattern3;

import ObserverPattern3.Office.I_Topic;

public class MemberA implements I_Topic {
    String name;

    Topic t;
    public MemberA(String name) {
        this.name = name;
    }
    
    @Override
    public void updateTopic(String updateTopic) {
       System.out.println(name);
    }



}
