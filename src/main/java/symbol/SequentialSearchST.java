package symbol;

import java.util.Iterator;

/**
 * 存疑
 * @author summer
 * @see <a href=""></a><br/>
 */
public class SequentialSearchST<K extends Comparable<K>,V> extends ST<K,V>{
    private Node first;
    private int size;

    public SequentialSearchST(){
        this.size=0;
    }
    private class Node{
        K key;
        V val;
        Node next;

        public Node(K key,V val,Node next){
            this.key=key;
            this.val=val;
            this.next=next;
        }

        public Node(K key,V val){
            this.key=key;
            this.val=val;
        }
    }

    @Override
    public void put(K key, V val) {
        size++;
        for(Node tmp=first;tmp!=null;tmp=tmp.next){
            if(tmp.key.equals(key)){
                tmp.val=val;
                return;
            }
        }
        //数值上不可能有序
        first=new Node(key,val,first);
    }

    @Override
    public V get(K key) {
        for(Node tmp=first;tmp!=null;tmp=tmp.next){
            if(tmp.key.equals(key)){
                return tmp.val;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public K minKey() {
        Node min=first;
        for(Node tmp=first.next;tmp!=null;tmp=tmp.next){
            if(less(tmp.key,min.key)){
                min=tmp;
            }
        }
        return min.key;
    }

    @Override
    public K maxKey() {
        Node max=first;
        for(Node tmp=first.next;tmp!=null;tmp=tmp.next){
            if(!less(tmp.key,max.key)){
                max=tmp;
            }
        }
        return max.key;
    }

    @Override
    public K floor(K key) {
        return null;
    }

    @Override
    public K ceiling(K key) {
        return null;
    }

    @Override
    public int rank(K key) {
        int rank=0;
        for(Node tmp=first;tmp!=null;tmp=tmp.next){
            //7→2→16→4
            if(tmp.key!=key){
                rank++;
            }
        }
        return rank;
    }

    /**
     * 需要排序
     */
    @Override
    public K selectKey(int k) {
        return null;
    }

    private class StIterator implements Iterator<K> {

        private Node lo,hi;

        public StIterator(K lo,K hi){
            Node loNode = null,hiNode = null;
            boolean findLo=false,findHi=false;
            for(Node tmp=first;tmp!=null;tmp=tmp.next){
                if(findLo&&findHi){
                    break;
                }
                if(tmp.key.equals(lo)){
                    loNode=tmp;
                    findLo=true;
                }
                if(tmp.key.equals(hi)){
                    hiNode=tmp;
                    findHi=true;
                }
            }
            this.lo=loNode;
            this.hi=hiNode;
        }
        @Override
        public boolean hasNext() {
            return rank(hi.key)-rank(lo.key)>=0;
        }

        @Override
        public K next() {
            Node tmp=lo;
            lo=lo.next;
            return tmp.key;
        }
    }

    /**
     * ✔
     */
    @Override
    public Iterator<K> keySet(K lo, K hi) {
        return new StIterator(lo,hi);
    }

    public static void main(String[] args) {
        new SequentialSearchST<>().minKey();
    }
}
