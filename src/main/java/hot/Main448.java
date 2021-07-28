package hot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for (int n:nums
        ) {
            set.add(n);
        }
        for (int i = 1; i < nums.length+1; i++) {
            if (!set.contains(i)){
                res.add(i);
            }
        }
        return res;
    }

    public List<Integer> findDisappearedNumbers1(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            //提供的位置上的数大于max(nums)
            int x = (num - 1) % n;
            nums[x] += n;
        }
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            //依然小于等于max(nums)的就是没有提供位置的
            if (nums[i] <= n) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
}
