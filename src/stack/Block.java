package stack;

public class Block {
    private Object data;
    private Block prev;

    public Block(Object data, Block prev) {
        this.data = data;
        this.prev = prev;
    }

    public Block getPrev () {
        return prev;
    }

    public Object getData () {
        return data;
    }
}
