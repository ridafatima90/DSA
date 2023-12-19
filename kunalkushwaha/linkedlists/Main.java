package kunalkushwaha.linkedlists;

public class Main {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertFirst(3);
        ll.insertFirst(14);
        ll.insertFirst(7);
        ll.insertFirst(9);
        ll.insertLast(99);
        ll.insert(2,3);
        ll.display();
        ll.deleteFirst();
        ll.display();
        ll.deleteLast();
        ll.display();
        ll.delete(2);
        ll.display();

    }
}
