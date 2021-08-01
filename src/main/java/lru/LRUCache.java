package lru;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class LRUCache {

    class DNode{
        int key;
        int val;
        DNode prev;
        DNode next;
        public DNode(){}
        public DNode(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    private final Map<Integer,DNode> cache;
    private int size;
    private final int capacity;
    private final DNode head;
    private final DNode tail;
    public LRUCache(int capacity){
        this.cache=new HashMap<>();
        this.size=0;
        this.capacity=capacity;
        head=new DNode();
        tail=new DNode();
        head.next=tail;
        tail.prev=head;
    }

    public int get(int key){
        DNode node=cache.get(key);
        if(node==null){
            return -1;
        }
        moveToHead(node);
        return node.val;
    }

    public void put(int key,int val){
        DNode node=cache.get(key);
        if(node==null){
            DNode newNode=new DNode(key,val);
            cache.put(key,newNode);
            addToHead(newNode);
            size++;
            if(size>capacity){
                DNode tail=removeTail();
                cache.remove(tail.key);
                size--;
            }
        }else {
            node.val=val;
            moveToHead(node);
        }
    }

    private DNode removeTail() {
        DNode res=tail.prev;
        removeNode(res);
        return res;
    }

    private void removeNode(DNode node) {
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    private void addToHead(DNode node) {
        node.prev=head;
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
    }

    private void moveToHead(DNode node) {
        removeNode(node);
        addToHead(node);
    }
}
