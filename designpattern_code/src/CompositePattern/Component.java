package CompositePattern;


//Khai báo interface hoặc abstract chung cho các thành phần đối tượng.
//Chứa các method thao tác chung của các thành phần đối tượng.
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }
    
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void display(int depth);
}
