package stack;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public abstract class LinkedStack<T> implements Stack<T> {

    private Node<T> first;

    private int size;

    @Override
    public int size() {
        return size;
    }

    /**
     * 链栈：头插法
     */
    @Override
    public void push(T elem) {
        Node<T> oldFirst=first;
        first=new Node<>(elem);
        first.next=oldFirst;
        size++;
    }

    @Override
    public T pop() {
        T data= first.data;
        first=first.next;
        size--;
        return data;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int cap() {
        return -1;
    }

    class Node<T>{
        private T data;
        private Node<T> next;
        public Node(T data) {
            this.data = data;
        }
    }
}
