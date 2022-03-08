package me.doubly;

public class Test {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dlinked = new DoublyLinkedList<Integer>();

        dlinked.add(1);
        dlinked.add(2);
        dlinked.add(3);
        dlinked.add(4);

        dlinked.print();
        dlinked.remove(0);
    }
}
