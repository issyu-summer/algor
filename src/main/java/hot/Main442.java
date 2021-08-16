package hot;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main442 {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        for (int i:nums) {
            nums[(i-1)%n]+=n;
        }
        for (int i = 0; i < n; i++) {
            if(2*n<nums[i]&&nums[i]<3*n+1){
                res.add(i+1);
            }
        }
        return res;
    }
}
