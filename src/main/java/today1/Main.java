package today1;

import java.util.*;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */



/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Main {
    static Map<Character,Integer> map=new HashMap<>();
    static int res=0;
    public static void main(String[] args) {
        Scanner in;
        int tmp=Integer.MAX_VALUE;
        String s=(in=new Scanner(System.in)).next();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if(map.containsKey(c)){
                res+=i-map.get(c)-1;
                tmp=Math.min(i,map.get(c));
            }
            map.put(c,tmp);
        }
        if(isParam(s)){
            res+=1;
        }
        System.out.println(res+s.length());

    }


    public static boolean isParam(String s){
        if(s.length()==1){
            return true;
        }
        int l=0,r=s.length()-1;
        while (l<r){
            if(s.charAt(l++)!=s.charAt(r--)){
                return false;
            }
        }
        return true;
    }

}
