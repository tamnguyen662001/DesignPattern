package IteratorPattern;

public class MyArray extends MyIterator {
    private int myArray[] = {1,2,3};

    @Override
    public ArrayIterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator extends ArrayIterator {
        @Override
        int getItem(int i) {
            for(int j = 0; j < myArray.length; j++){
                if(i == j)
                    return myArray[j];
            }
            return -1;
        }

        @Override
        int count() {
            return myArray.length;
        }
    }
}
