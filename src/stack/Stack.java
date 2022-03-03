package stack;

/*
    Stack 스택

    LIFO 구조 (Last input first out)
    마지막에 넣은 데이터가 가장 먼저 나온다

    pop() : 가장 최상단의 항목을 제거
    push(element) : 스택에 데이터를 추가함
    peek() : 스택의 가장 윗부분을 가져옴
    isEmpty() 스택이 비어있을 때 true 를 반환

 */

public class Stack {
    private Element top;

    public void pop () {
        if (!isEmpty() && top.getPrev() != null) {
            top = top.getPrev();
        }
        else {
            top = null;
        }
    }

    public void push (Object data) {
        if (isEmpty()) {
            top = new Element(data, null);
        }
        else {
            top = new Element(data, top);
        }
    }

    public Object peek () {
        return (!isEmpty()) ? top.getData() : null;
    }

    public boolean isEmpty () {
        return (top == null) ? true : false;
    }

    static class Element {

        private Object data;
        private Element prev;

        public Element (Object data, Element prev) {
            this.data = data;
            this.prev = prev;
        }

        public Element getPrev () {
            return prev;
        }

        public Object getData () {
            return data;
        }
    }
}
