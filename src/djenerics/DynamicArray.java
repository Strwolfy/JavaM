package djenerics;

import java.util.ArrayList;

public class DynamicArray<T> {
    private T t;
    private int [] element;
    private int size;
    private T[] elements;
    private static final int CAPACITY = 10;
    public DynamicArray(){
        this.elements =  (T[]) new Object[CAPACITY];
    }

    public int size() {
        return size;
    }

    void add(T el) {
        // T[] array = new T[el];
    }

    void remove(int index) {
        isIndexExist(index);
        T [] temp = elements;
        //elements = new T[temp.length - 1];

    }
    T get(int index) {
        return t;
    }

    private int isIndexExist(int index){
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException("Element can't be found! "
                    + "Number of elements in array = " + size
                    + ". Total size of array = " + elements.length);
        }
        return index;
    }

    public static void main(String[] args) {

        ArrayList<DynamicArray> myList = new ArrayList<>();

    }

}