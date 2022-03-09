package me.doubly;

public class DoublyLinkedList<T> {
    private Node head, tail;
    private int size = -1;

    public void add (T data) {
        if (head == null) {
            head = new Node(null, null, data);
            tail = head;
        }
        else if (head.equals(tail)) {
            tail = new Node(head, null, data);
            head.setNext(tail);
        }
        else {
            Node temp = new Node(tail, null, data);
            tail.setNext(temp);
            tail = temp;
        }
        size++;
    }

    public void print () {
        Node temp = head;
        for (; temp != null; temp=temp.getNext()) {
            System.out.println(temp.getData());
        }
    }

    public void remove (int index) {
        indexOutCheck(index);

        if (index == 0) {
            Node temp = head;
            head = head.getNext();
            temp.setNext(null);
            return;
        }

        getObject(index-1).setNext(getObject(index+1));
        getObject(index+1).setPrevious(getObject(index-1));
    }

    public void indexOutCheck (int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    public Node getObject (int index) {
        Node temp;

        indexOutCheck(index);

        if (index >= (size / 2)) {
            temp = tail;
            for(int i = size; i>index; i--) {
                temp = temp.getPrevious();
            }
            return temp;
        }

        temp = head;
        for (int i = size; i<index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public T get (int index) {
        Node temp;

        indexOutCheck(index);
        return (T)getObject(index).getData();
    }

    public int getSize () {
        return size;
    }
}
