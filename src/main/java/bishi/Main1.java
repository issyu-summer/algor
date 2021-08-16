package bishi;

import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * @author summer
 * @see <a href=""></a><bsr/>
 */
public class Main1 {

    static final Map<Character,Integer> change=new HashMap<Character,Integer>(){{
        put('0',1);put('1',5);put('2',2);put('3',2);put('4',3);put('5',2);put('6',1);put('7',4);put('8',0);put('9',1);
    }};
    static final Map<Character,Integer> noChange=new HashMap<Character,Integer>(){{
        put('0',6);put('1',2);put('2',5);put('3',5);put('4',4);put('5',5);put('6',6);put('7',3);put('8',7);put('9',6);
    }};
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str = s.nextLine();
        int n=str.length();
        for (int i = 1; i <=n; i++) {
            int sum=0;
            String last = "";
            for (int j = 0; j+i<=n; j++) {
                String substring = str.substring(j, j + i);
                if(j==0){
                    int l=0,r=i;
                    while (l<=r-1){
                        sum+=noChange.get(str.charAt(l++));
                    }
                }else {
                    int len=substring.length();
                    for (int k = 0; k < len; k++) {
                        sum+=change.get(last.charAt(k))+change.get(substring.charAt(k));
                    }
                }
                last=substring;
            }
            System.out.printf(sum+" ");
        }
    }
    }
