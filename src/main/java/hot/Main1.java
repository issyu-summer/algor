package hot;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1 {

    //同sword.Main1(两数之和)
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while (i<j){
            if(nums[i]+nums[j]<target){
                i++;
            }else if(nums[i]+nums[j]>target){
                j--;
            }else {
                return new int[]{
                        nums[i],nums[j]
                };
            }
        }
        return new int[0];
    }

    public int[] twoSum1(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                return new int[]{
                        map.get(nums[i]),i
                };
            }
            map.put(target-nums[i],i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main1().twoSum1(new int[]{
                3, 2, 4
        }, 6)));;
    }

}
