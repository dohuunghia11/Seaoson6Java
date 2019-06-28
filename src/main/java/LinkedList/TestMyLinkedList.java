package LinkedList;

import ArrayList.MyList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(0,4);
        myLinkedList.add(1,7);
        myLinkedList.add(2,2);
        myLinkedList.add(3,9);
        myLinkedList.add(4,8);
        System.out.println("(1) " + myLinkedList);
    }
}
