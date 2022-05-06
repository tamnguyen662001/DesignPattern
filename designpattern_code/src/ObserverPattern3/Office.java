package ObserverPattern3;

import java.util.ArrayList;
import java.util.List;

public class Office {
    List<Topic> allTopic = new ArrayList<>();

    List<I_Topic> observers = new ArrayList<>();
    public void addTopic(Topic a){
        allTopic.add(a);


    }
    public void attach(I_Topic a){
        if(!observers.contains(a)){
            observers.add(a);
        }
    }
    
    public void detach(I_Topic a){
        if(observers.contains(a)){
            observers.remove(a);
        }
    }
    
    public void notifyExchangerate(String delta){
        for(I_Topic a: observers){
            a.updateTopic(delta);
        }
    }
    public static interface I_Topic{
        void updateTopic(String updateTopic); 
    }
}
