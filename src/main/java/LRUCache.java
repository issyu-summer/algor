import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class LRUCache {
    class DNode{
        int key;
        int val;
        DNode next;
        DNode prev;
        public DNode(){}
        public DNode(int key,int val){
            this.key=key;
            this.val=val;
            this.next=null;
            this.prev=null;
        }
    }

    Map<Integer,DNode> cache;
    int size;
    int capacity;
    DNode head;
    DNode tail;

    public LRUCache(int capacity){
        this.capacity=capacity;
        this.size=0;
        this.head=new DNode();
        this.tail=new DNode();
        cache=new HashMap<>();
    }

    public int get(int key){
        DNode node = cache.get(key);
        if(node==null){
            return -1;
        }else{
            moveToHead(node);
        }
        return node.val;
    }

    public void put(int key, int value){
        DNode node = cache.get(key);
        if(node==null){
            node=new DNode(key,value);
            size++;
            addToHead(node);
            if(size>capacity){
                removeTail();
                size--;
            }
        }else {
            node.val=value;
            cache.put(key,node);
            moveToHead(node);
        }
    }

    private void  remove(DNode node){
        DNode pre = node.prev;
        DNode next = node.next;
        pre.next=next;
        next.prev=pre;
    }

    private void removeTail() {
        DNode realTail = tail.prev;
        remove(realTail);
    }

    private void addToHead(DNode node) {
        DNode realHead = head.next;
        head.next=node;
        node.prev=head;
        node.next=realHead;
        realHead.prev=node;
    }


    private void moveToHead(DNode node) {
        remove(node);
        addToHead(node);
    }
}
