import ArrayList.MyArrayList;

public class MyArrayList1<E> extends MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] data = (E[]) new Object[DEFAULT_CAPACITY];

    public MyArrayList1(){}

    public MyArrayList1(E[] objects){
        for( int i = 0; i < objects.length; i++){
            add(objects[i]);
        }
    }

    public void clear() {

        for(int var1 = 0; var1 < this.size; ++var1) {
            this.data[var1] = null;
        }

        this.size = 0;
    }
    public int size() {
        return size;
    }

}
