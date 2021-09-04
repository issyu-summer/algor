package repeat;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/minimum-window-substring/">最小覆盖子串</a><br/>
 * 背过
 */
public class Main76 {
    public String minWindow(String s, String t) {
        Map<Character,Integer> hs=new HashMap<>();
        Map<Character,Integer> ht=new HashMap<>();
        char c;
        //统计t中字符出现的次数
        for (int i = 0; i < t.length(); i++) {
            ht.put((c=t.charAt(i)),ht.getOrDefault(c,0)+1);
        }
        //维护最短的长度
        int begin=-1,len=Integer.MAX_VALUE;
        //用于检测是否达到了t的长度
        int cnt=0;
        for (int i = 0,j=0; i < s.length(); i++) {
            hs.put((c=s.charAt(i)),hs.getOrDefault(c,0)+1);
            //包含且不超过t串，cnt++
            if(ht.containsKey(c)&&hs.get(c)<=ht.get(c)){
                cnt++;
            }
            while (j<i&&(
                    //不包含左指针右移
                    !ht.containsKey((c=s.charAt(j)))||
                        //数量多了左指针也右移动
                        hs.get(c)>ht.get(c))){
                hs.put(c,hs.get(c)-1);
                j++;
            }
            if(cnt==t.length()
                &&i-j+1<len){
                begin=j;
                len=i-j+1;
            }
        }
        return begin==-1?"":s.substring(begin,begin+len);

    }

    public static void main(String[] args) {
        String s = new Main76().minWindow("a", "b");
        System.out.println(s);
    }
}
