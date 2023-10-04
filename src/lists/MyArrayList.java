package lists;

import java.util.Arrays;

public class MyArrayList<E> {
    private Object[] elements;
    private static final int DEFAULT_CAPACITY = 10 ;
    private int lastIndex;
    private int capacity;

    public MyArrayList(){
        elements= new Object[capacity=DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity){
        elements= new Object[capacity=initialCapacity];
    }

    public void add(E element){
        if (lastIndex==capacity){
            growSize();
        }
        elements[lastIndex++] = element;

    }

    private void growSize() {
        elements = Arrays.copyOf(elements,capacity= elements.length + (elements.length/2));
    }


    public E get(int index){
        checkIndex(index);
        return (E) elements[index];
    }

    private void checkIndex(int index) {
        if (index>=elements.length || index<0){
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void remove(int index){
        checkIndex(index);
        Object[] newElements  = new Object[capacity-=1];

        for (int i = 0; i < newElements.length; i++) {
            if (i<index){
                newElements[i]= elements[i];
            }else {
                newElements[i] = elements[i+1];
            }
        }
        lastIndex--;
        elements=newElements;
    }

    public int length(){
        return lastIndex;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < lastIndex; i++) {
            stringBuilder.append(elements[i]);

            if (i < lastIndex-1){
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void add(int index , E element){
        checkIndex(index);
        if (index==capacity){
            growSize();
        }
        elements[index] = element;

    }
}
