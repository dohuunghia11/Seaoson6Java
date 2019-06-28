public class MyArrayListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyArrayList1<Integer> ll = new MyArrayList1<>();
        ll.add(0, 10);
        ll.add(1,11);
        ll.add(2,14);
        ll.add(3,4);
        ll.add(4,25);
        System.out.println(ll.get(4));
        ll.clear();
        System.out.println(ll);
    }
}
