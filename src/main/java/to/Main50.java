package to;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main50 {

    public char firstUniqChar(String s) {
        Map<Character,Boolean> map=new HashMap<>();
        char[] ar;
        for (char c:(ar=s.toCharArray())) {
            map.put(c,!map.containsKey(c));
        }
        for (char c:ar) {
            if(map.get(c)){
                return c;
            }
        }
        return ' ';
    }
}
