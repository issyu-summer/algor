package jindian;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main0104 {

    public boolean canPermutePalindrome(String s) {
        char[] ar = s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for (char c:ar) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int odd=0;
        for (int val:map.values()) {
            if((val&1)!=0){
                odd++;
            }
            if(odd>1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Main0104().canPermutePalindrome("tactcoa"));
    }
}
