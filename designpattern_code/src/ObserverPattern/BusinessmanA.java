package ObserverPattern;

import ObserverPattern.Exchangerate.I_TrackingExchangerate;

public class BusinessmanA implements I_TrackingExchangerate {

    Exchangerate t;

    public BusinessmanA(Exchangerate t) {
        this.t = t;
        t.attach(this);
    }
    
    public void cancel(){
        t.detach(this);
    }
    
    @Override
    public void updateExchangerate(float delta) {
        if(delta > 0){
            System.out.println("Businessman A: Mua vao");
        }
        else{
            if(delta == 0){
                System.out.println(" Businessman A: doi");
            }
            else{
                System.out.println("Businessman A: Ban ra ");
            }
        }      
        
    }
    
    
}
