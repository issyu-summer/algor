package queue;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public abstract class LinkedQueue<T> implements Queue<T>{

    private Node<T> first;
    private Node<T> last;
    private int size;

    @Override
    public void enqueue(T data) {
        Node<T> oldLast=last;
        last= new Node<>(data);
        if(isEmpty()){
            first=last;
        }else {
            oldLast.next=last;
        }
        size++;
    }

    @Override
    public T dequeue() {
        T data= first.data;
        first=first.next;
        if(isEmpty()){
            last=null;
        }
        size--;
        return data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    class Node<T>{
        private T data;
        private Node<T> next;
        public Node(T data){
            this.data=data;
        }
    }
}
