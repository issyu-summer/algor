package lru;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class LRU <K,V>{

    //双向链表
    class DNode{
        K key;
        V val;
        DNode prev;
        DNode next;
        public DNode(){}
        public DNode(K key,V val){
            this.key=key;
            this.val=val;
        }
    }

    private Map<K,DNode> cache;
    //当前元素数量
    private int size;
    //元素容量
    private int capacity;
    //双向链表,虚拟head和tail
    private DNode head;
    private DNode tail;
    //初始化输入容量
    public  LRU(int capacity){
        this.size=0;
        this.cache=new HashMap<>();
        this.capacity=capacity;
        head=new DNode();
        tail=new DNode();
        head.next=tail;
        tail.prev=head;
    }

    //为null直接返回，否则将查询到的移动到头部
    public V get(K key){
        DNode node=cache.get(key);
        if(node==null){
            return null;
        }
        moveToHead(node);
        return node.val;
    }


    public void put(K key,V val){
        DNode node=cache.get(key);
        //查询不到，放如cache和链表头
        if(node==null){
            DNode newNode=new DNode(key,val);
            cache.put(key,newNode);
            addToHead(newNode);
            size++;
            //当前元素数量大于容量时，从链表移除尾部+从map中移除
            if(size>capacity){
                DNode tail=removeTail();
                cache.remove(tail.key);
                size--;
            }
            //能够查询到，更新值并移动到头部
        }else {
            node.val=val;
            cache.put(key,node);
            moveToHead(node);
        }
    }

    //在尾部移除,移除真尾部（tail.prev）
    private DNode removeTail() {
        DNode realTail=tail.prev;
        removeNode(realTail);
        return realTail;
    }

    //移除节点，前驱和后继建立联系
    private void removeNode(DNode res) {
        DNode pre=res.prev;
        DNode next=res.next;
        pre.next=next;
        next.prev=pre;
    }

    //在头部添加，head,realHead,node
    private void addToHead(DNode node) {
        //缓存head的下一个（next）
        DNode realHead=head.next;
        //将next与node建立联系
        node.next=realHead;
        realHead.prev=node;
        //将head与node建立联系
        head.next=node;
        node.prev=head;
    }

    //移动到头不，从链表中删除+添加到头不
    private void moveToHead(DNode node) {
        removeNode(node);
        addToHead(node);
    }

    public static void main(String[] args) {
        LRU<Integer, Integer> lru = new LRU<>(2);
        lru.put(1,1);
        lru.put(2,2);
        System.out.println(lru.get(1));
        lru.put(3,3);
        System.out.println(lru.get(2));
        lru.put(4,4);
        System.out.println(lru.get(1));
        System.out.println(lru.get(3));
        System.out.println(lru.get(4));
    }

}
