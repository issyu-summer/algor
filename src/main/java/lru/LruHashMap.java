package lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class LruHashMap<K,V> extends LinkedHashMap<K,V> {

    private final int capacity;

    public LruHashMap(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry entry) {
        return size() > capacity;
    }


    public static void main(String[] args) {
        LruHashMap<Object, Object> cache = new LruHashMap<>(4);
        cache.put(1,"a");
        cache.put(2,"b");
        cache.put(3,"c");
        cache.get(1);
        cache.get(2);
        cache.put(4,"d");
        cache.put(5,"e");
        System.out.println(cache);
    }
}
