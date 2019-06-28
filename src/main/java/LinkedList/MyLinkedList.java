package LinkedList;

import ArrayList.MyAbstractList;

import java.util.Iterator;

public class MyLinkedList<E> extends MyAbstractList<E> {
    private Node head;
    private Node tail;
    private int numNodes;
    public static final int INITIAL_CAPACITY = 16;
    private E[] data = (E[]) new Object[INITIAL_CAPACITY];

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    @Override
    public void add(int index, Object o) {

    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E o) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int indexOf(E o) {
        return 0;
    }

    @Override
    public int lastIndexOf(E o) {
        return 0;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E set(int index, E o) {
        return null;
    }


    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("[");
        for(int i = 0; i < size; i++){
            result.append(data[i]);
            if(i < size - 1) result.append(", ");
        }
        return result.toString() + "]";
    }
    @Override
    public java.util.Iterator<E> iterator() {
        return new ArrayListIterator();
    }
    private class ArrayListIterator implements java.util.Iterator<E>{
        private int current = 0;
        @Override
        public boolean hasNext() {
            return (current < size);
        }

        @Override
        public E next() {
            return data[current++];
        }

        @Override
        public void remove() {
            MyLinkedList.this.remove(current);
        }
    }
//    public void addLast(Object data){
//        Node temp = tail;
//        temp =
//    }
}
