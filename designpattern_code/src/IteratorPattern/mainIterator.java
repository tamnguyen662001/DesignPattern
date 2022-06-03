package IteratorPattern;

public class mainIterator {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();

        ArrayIterator arrayIterator = myArray.getIterator();
        System.out.println("Vị trí i = 1");
        System.out.println(arrayIterator.getItem(1));
        System.out.println("Số phần tử: ");
        System.out.println(arrayIterator.count());
    }
}
