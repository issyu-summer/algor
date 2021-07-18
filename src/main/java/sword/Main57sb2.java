package sword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main57sb2 {
    public int[][] findContinuousSequence(int target) {
        int i=1,j=2,s=3;
        List<int []> res=new ArrayList<>();
        while (i<j){
            if(s==target){
                int []ans=new int[j-i+1];
                for (int k = i; k <=j ; k++) {
                    ans[k-i]=k;
                }
                res.add(ans);
            }
            if(s<target) {
                j++;
                s += j;
            }
            if(s>=target){
                s-=i;
                i++;
            }
        }
        return res.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Main57sb2().findContinuousSequence(9)));
    }
}
