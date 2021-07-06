package link;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public abstract class AbstractLink<T> implements Link<T>{

    private Node<T> first;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addHead(T elem){
        Node<T> oldHead= first;
        first = new Node<>(elem);
        first.next= oldHead;
        size++;
    }

    @Override
    public void deleteHead(){
        Node<T> oldHead= first;
        first = first.next;
        oldHead.elem=null;
        oldHead.next=null;
    }

    @Override
    public T removeHead(){
        Node<T> oldHead= first;
        first = first.next;
        return oldHead.elem;
    }

    @Override
    public void addTail(T elem){
        //TODO
    }

    @Override
    public T removeTail(){
        return null;
    }

    /**
     * O（n）
     */
    @Override
    public void deleteTail() {
        Node<T> tmp=new Node<>();
        Node<T> head=first;
        tmp.next=head;
        while (head.next!=null) {
            head = head.next;
            tmp = tmp.next;
        }
        tmp.next=null;
        size--;
    }


    /**
     * O（n）
     */
    public void delete(int k){
        Node<T> tmp=first;
        for (int i = 1; i < k-1; i++) {
            tmp=tmp.next;
        }
        Node<T> node =tmp.next;
        if(node!=null){
            tmp.next=node.next;
            node.next=null;
        }
        size--;
    }
    private class Node<T>{

        T elem;
        Node<T> next;

        public Node(){
            elem=null;
            next=null;
        }

        public Node(T elem){
            this.elem=elem;
            this.next=null;
        }

        public Node(T elem, Node<T> next){
            this.elem=elem;
            this.next=next;
        }
    }


}
