package tme;

import javax.security.auth.callback.CallbackHandler;
import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1 {

    public int longestSub(String s){
        int j=-1,res=0;
        char c;
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey((c=s.charAt(i)))){
                j=Math.max(j,map.get(c));
            }
            map.put(c,i);
            res=Math.max(res,i-j);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Main1().longestSub("abcabcbb"));
    }

}
