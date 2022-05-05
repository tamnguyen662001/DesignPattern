package ObserverPattern;

import ObserverPattern.Exchangerate.I_TrackingExchangerate;

public class BusinessmanB implements I_TrackingExchangerate {
    Exchangerate t;

    public BusinessmanB(Exchangerate t) {
        this.t = t;
        t.attach(this);
    }
    
    public void cancel(){
        t.detach(this);
    }
    @Override
    public void updateExchangerate(float delta) {
        if(delta < 0){
            System.out.println("Businessman B : Mua vao");
        }
        else{
            if(delta == 0){
                System.out.println("Businessman B : Ban ra");
            }
            else{
                System.out.println("Businessman B : Doi ");
            }
        }      
        
    }
    
    
}
