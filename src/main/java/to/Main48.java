package to;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main48 {

    public int lengthOfLongestSubstring(String s) {
        int len;
        if((len=s.length())==0){
            return 0;
        }
        int j=-1;
        char c;
        int res=Integer.MIN_VALUE;
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 1; i < len; i++) {
            if(map.containsKey(c=s.charAt(i))){
                j=Math.min(j,map.get(c));
            }
            map.put(c,i);
            res=Math.max(res,j-i);
        }
        return res;
    }
}
