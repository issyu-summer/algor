package stack;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Solution1 {

    int k;
    int res;
    boolean[][] visited;
    List<Character> tmp;
    public int maxValue (String s, int k) {
        // write code here
        int res=Integer.MIN_VALUE;
        String substring;
        for (int i = 0; i < s.length(); i++) {
            if(i==s.length()-k){
                substring=s.substring(i);
            }else {
                substring = s.substring(i, i + k);
            }
            res=Math.max(res, Integer.parseInt(substring));
            if(i+k>=s.length()){
                break;
            }
        }
        return res;
    }

    public int maxValue1(String s,int k){
        char[] ar = s.toCharArray();
        String[] list=new String[ar.length];
        for (int i = 0; i < ar.length; i++) {
            list[i]=String.valueOf(ar[i]);
        }
        Arrays.sort(list,(x,y)->((y+x).compareTo(x+y)));
        int res=0;
        for (int i = 0; i < k; i++) {
            char c = list[i].charAt(0);
            res=10*res+c-'0';
        }
        System.out.println(res);
        return res;
    }

    private void backTrace(char[] ar, int deep) {
        if(deep==k){
            int t=0;
            for (Character c : tmp) {
                t = 10 * t + c - '0';
            }
            res=Math.max(res,t);

        }
        if(deep>k){
            return;
        }
        for (int i = deep; i < ar.length; i++) {
            tmp.add(ar[i]);
            backTrace(ar,deep+1);
            tmp.remove(tmp.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution1().maxValue("321",2));
    }


}
