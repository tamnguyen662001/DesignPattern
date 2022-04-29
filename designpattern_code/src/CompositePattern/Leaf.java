package CompositePattern;

import java.util.Arrays;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("Can't add to a leaf.");
        
    }

    @Override
    public void display(int depth) {
        char[] charArray = new char[depth];
		Arrays.fill(charArray, '-');
		System.out.println(new String(charArray) + super.name);
        
    }

    @Override
    public void remove(Component component) {
        System.out.println("Can't remove to a leaf.");
    }
    
    
}
