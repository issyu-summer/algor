package sword;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main48 {

    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")){
            return 0;
        }
        Map<Character,Integer> dict=new HashMap<Character,Integer>(){{put(s.charAt(0),0);}};
        int []dp=new int[s.length()];
        int max=dp[0]=1;
        for (int i = 1; i < s.length(); i++) {
            Character c=s.charAt(i);
            if(dict.containsKey(c)){
                int j=dict.get(c);
                //包含了重复字符
                if(dp[i-1]>=i-j){
                    dp[i]=i-j;
                }else {
                    dp[i]=dp[i-1]+1;
                }
            }else {
                dp[i]=dp[i-1]+1;
            }
            dict.put(c,i);
            max=Math.max(max,dp[i]);
        }
        return max;
    }


    public int lengthOfLongestSubstring1(String s) {
        if(s.equals("")){
            return 0;
        }
        Map<Character,Integer> dict=new HashMap<Character,Integer>();
        int j=-1,res=0;
        for (int i = 0; i < s.length(); i++) {
            if(dict.containsKey(s.charAt(i))){
                j=Math.max(j,dict.get(s.charAt(i)));
            }
            dict.put(s.charAt(i),i);
            res=Math.max(res,i-j);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(new Main48().lengthOfLongestSubstring("abcabcbb"));
    }
}
