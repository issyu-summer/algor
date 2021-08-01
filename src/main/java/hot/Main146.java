package hot;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main146 {

    static class LRUCache   {
        LinkedHashMap<Integer,Integer> map;

        public LRUCache(int capacity) {
            map= new LinkedHashMap<>() {
                @Override
                protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                    return size() >= capacity;
                }
            };
        }

        public int get(int key) {
            return this.map.get(key);
        }

        public void put(int key, int value) {
            this.map.put(key,value);
        }
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache.get(1);
    }
}
