public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList1 ll = new MyLinkedList1(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(6);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();
    }
}