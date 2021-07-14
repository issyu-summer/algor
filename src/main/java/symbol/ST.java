package symbol;

import java.util.Iterator;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public abstract class ST<K extends Comparable<K>,V> implements SymbolTable<K,V>{

    public ST(){

    }

    @Override
    public void delete(K key) {
        put(key,null);
    }

    @Override
    public boolean contains(K key) {
        return get(key)!=null;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public void delMinKey() {
        delete(minKey());
    }

    @Override
    public void delMaxKey() {
        delete(maxKey());
    }

    @Override
    public boolean less(K lo, K hi) {
        return lo.compareTo(hi)<0;
    }

    @Override
    public int size(K lo, K hi) {
        if(less(hi,lo)){
            return 0;
        }else if(contains(hi)){
            return rank(hi)-rank(lo)+1;
        }else {
            return rank(hi)-rank(lo);
        }
    }

    @Override
    public Iterator<K> keySet() {
        return keySet(minKey(),maxKey());
    }
}
