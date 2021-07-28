package sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class CountSort {

    private static int max(int []ar){
        int max=0;
        for (int n:ar) {
            max=Math.max(n,max);
        }
        return max;
    }

    public static void sort(int []ar){
        List<Integer> list=new ArrayList<>();
        int max=max(ar);
        int []count=new int[max+1];
        for (int n:ar) {
            count[n]++;
        }
        for (int i = 0; i < count.length; i++) {
            while (count[i]!=0){
                list.add(i);
                count[i]--;
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        CountSort.sort(new int[]{1,3,5,6,7,912,2,3,3});
    }
}
