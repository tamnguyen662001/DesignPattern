package SingletonPattern;

import javax.swing.JOptionPane;

public class SingletonExample {
    private String state = "initial state";
    private static final SingletonExample instance = new SingletonExample();
    private SingletonExample(){}
     
    public static SingletonExample getInstance(){
        return instance;
    }
     
    public void printState(){
        JOptionPane.showMessageDialog(null, state, "Singleton Example", JOptionPane.OK_OPTION);
    }
     
    public void nextState(){
        if(state.equals("initial state")){
            state = "second state";
        } else if(state.equals("second state")){
            state = "third state";
        } else if(state.equals("third state")){
            state = "initial state";
        }
    }
}
