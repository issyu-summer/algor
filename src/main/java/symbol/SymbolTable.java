package symbol;

import java.util.Iterator;

/**
 * ordered symbol table
 * @author summer
 * @see <a href=""></a><br/>
 */
public interface SymbolTable <K extends Comparable<K>,V>{
    void put(K key,V val);
    V get(K key);
    void delete(K key);
    boolean contains(K key);
    boolean isEmpty();
    int size();
    Iterator<K> keySet();
    K minKey();
    K maxKey();
    //小于key的最小键
    K floor(K key);
    //大于key的最大键
    K ceiling(K key);
    //小于key的键的数量
    int rank(K key);
    //排名K的键
    K selectKey(int k);
    void delMinKey();
    void delMaxKey();
    int size(K lo,K hi);
    Iterator<K> keySet(K lo, K hi);
    boolean less(K lo,K hi);
}
