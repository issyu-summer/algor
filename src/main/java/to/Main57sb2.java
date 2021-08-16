package to;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main57sb2 {
    //和为s的连续整数序列
    public int[][] findContinuousSequence(int target) {
        List<int []> list=new ArrayList<>();
        int l=1,r=2,sum=3;
        while (l<r){
            if(sum==target){
                int []ar=new int[r-l+1];
                for (int i = l; i <=r; i++) {
                    ar[i-l]=i;
                }
                list.add(ar);
            }
            if(sum<target){
                r++;
                sum+=r;
            }else {
                sum-=l;
                l++;
            }
        }
        return list.toArray(new int[0][]);
    }

}
