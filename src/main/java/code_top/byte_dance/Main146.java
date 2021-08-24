package code_top.byte_dance;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main146 {

    public class LRUCache{
        class DNode{
            int key;
            int val;
            DNode next;
            DNode pre;
            public DNode(int key,int val){
                this.key=key;
                this.val=val;
            }
            public DNode(){

            }
        }
        Map<Integer,DNode> cache;
        DNode vHead;
        DNode vTail;
        int capacity;
        int size;
        public LRUCache(int capacity){
            this.capacity=capacity;
            this.size=0;
            this.vHead=new DNode();
            this.vTail=new DNode();
            vHead.next=vTail;
            vTail.pre=vHead;
            this.cache =new HashMap<>();
        }

        public void put(int key,int val){
            DNode node = cache.get(key);
            if(node==null){
                node=new DNode(key,val);
                cache.put(key,node);
                addToHead(node);
                size++;
                if(size>capacity){
                    DNode tail = removeTail();
                    cache.remove(tail.key);
                    size--;
                }
            }else {
                node.val=val;
                moveToHead(node);
            }
        }

        public int get(int key){
            DNode node = cache.get(key);
            if(node!=null){
                moveToHead(node);
                return node.val;
            }
            return -1;
        }

        private void remove(DNode node){
            DNode pre = node.pre;
            DNode next = node.next;
            pre.next=next;
            next.pre=pre;
        }
        private DNode removeTail() {
            DNode realTail = vTail.pre;
            remove(realTail);
            return realTail;
        }
        private void addToHead(DNode node) {
            DNode realHead=vHead.next;
            vHead.next=node;
            node.next=realHead;
            node.pre=vHead;
            realHead.pre=node;
        }
        private void moveToHead(DNode node) {
            remove(node);
            addToHead(node);
        }


    }


}
