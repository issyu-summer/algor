package meituan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main4 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]ar=new int[n];
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            int t= scanner.nextInt();
            map.put(t,map.getOrDefault(t,0)+1);
        }
        int count=0;
        for (Integer v :map.values()) {
            if((v&1)!=0){
                while (v>2){
                    v-=2;
                }
                count+=v;
            }
        }
        System.out.println(count/2);
    }
}
