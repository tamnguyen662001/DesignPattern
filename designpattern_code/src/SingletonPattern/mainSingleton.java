package SingletonPattern;

public class mainSingleton {
    public static void main(String[] args) {
        SingletonExample theSingleton = SingletonExample.getInstance();
        theSingleton.printState(); //Output: initial state
        theSingleton.nextState();
        theSingleton.printState(); //Output: second state
         
        // SingletonExample anotherSingleton = SingletonExample.getInstance();
        // anotherSingleton.printState(); //Output: second state
        // theSingleton.printState(); //Output: second state
        // anotherSingleton.nextState();
        // anotherSingleton.printState(); //Output: third state
        // theSingleton.printState(); //Output: third state
    }
    
}
