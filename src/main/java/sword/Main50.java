package sword;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main50 {

    public static char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character,Boolean> map=new HashMap<>();
        for (char c:chars) {
            map.put(c,!map.containsKey(c));
        }
        //使用原字符串规避顺序问题,或者使用linkedHashMap
        for (char c:chars) {
            if(map.get(c)){
                return c;
            }
        }
        return ' ';
    }
}
