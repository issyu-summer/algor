package code_top.byte_dance;

import hot.Main79;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main76 {

    //最小覆盖子串、不要求顺序、使用hashmap
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> hs = new HashMap<>();
        HashMap<Character,Integer> ht = new HashMap<>();
        //统计t中字符出现的次数
        for(int i = 0;i < t.length();i ++) {
            ht.put(t.charAt(i),ht.getOrDefault(t.charAt(i), 0) + 1);
        }
        String ans = "";
        //维护最短长度
        int len = Integer.MAX_VALUE;
        //是否达到了t的长度要求
        int cnt = 0;//有多少个元素符合
        for(int i = 0,j = 0;i < s.length();i ++)
        {
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0) + 1);
            //包含且数量不超过子串，cnt计数++
            if(ht.containsKey(s.charAt(i)) && hs.get(s.charAt(i)) <= ht.get(s.charAt(i))) {
                cnt ++;
            }
            //维护双指针
            while(j < i && (
                    //不包含直接左指针右移动
                    !ht.containsKey(s.charAt(j)) ||
                            //数量多了也直接右移,直到数量合适为止,此条会先触发,触发之前j一直为0
                            hs.get(s.charAt(j)) > ht.get(s.charAt(j)))) {
                hs.put(s.charAt(j), hs.get(s.charAt(j)) - 1);
                j++;
            }
            //达到t的长度时计算溢出结果
            if(cnt == t.length() &&
                    //维护最小的长度
                    i - j + 1 < len)
            {
                len = i - j + 1;
                ans = s.substring(j,i + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = new Main76().minWindow("ADOBECODEBANC", "ABC");
        System.out.println(s);
    }
}
