package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Exchangerate {
    List<I_TrackingExchangerate> observers = new ArrayList<I_TrackingExchangerate>();
    
    public void attach(I_TrackingExchangerate a){
        if(!observers.contains(a)){
            observers.add(a);
        }
    }
    
    public void detach(I_TrackingExchangerate a){
        if(observers.contains(a)){
            observers.remove(a);
        }
    }
    
    public void notifyExchangerate(float delta){
        for(I_TrackingExchangerate a: observers){
            a.updateExchangerate(delta);
        }
    }
    
    static public interface I_TrackingExchangerate{
        void updateExchangerate(float delta);
    }
}
