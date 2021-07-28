package hot;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main3 {

    //同sword.Main48:最长不含重复字符的子字符串
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")){
            return 0;
        }
        int j=-1,res=0;
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                j=Math.max(j,map.get(s.charAt(i)));
            }
            map.put(s.charAt(i),i);
            res=Math.max(res,j-i);
        }
        return res;
    }
}
