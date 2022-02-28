package linkedList;

public class LinkedList<T> {
    public Element<T> top, current;

    public void add (T value) {
        if (top == null) {
            top = new Element<T>(value, null);
            return;
        }

        current = top;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(new Element<T>(value, null));
        current = top;
    }

    public void remove (int index) {
        for (int i=0; i<(index-1); i++) {
            current = current.getNext();
        }

        if (current.getNext().getNext() != null) {
            current.setNext(current.getNext().getNext());
            return;
        }
        else {
            current.setNext(null);
        }
    }

    public int size () {
        /*
            Todo 인덱스 범위 확인
         */

        int result = 0;
        while (current != null) {
            current = current.getNext();
            result++;
        }

        return result;
    }

    // Debug
    public void print () {
        current = top;
        int size = 0;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
        current = top;
    }
}
