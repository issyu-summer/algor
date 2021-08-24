package code_top.byte_dance;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (map.containsKey(n)) {
                return new int[]{
                        i, map.get(n)
                };
            }
            map.put(target - n, i);
        }
        return new int[0];
    }
}
