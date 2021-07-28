package hot;

import java.util.*;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        if(nums.length<=2){
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            if(nums[i]>0) break;
            if(i>0&&nums[i]==nums[i-1]) continue;
            int target=-nums[i];
            int l=i+1,r=nums.length-1;
            while (l<r){
                if(nums[l]+nums[r]==target){
                    res.add(new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r])));
                    l++;
                    r--;
                    while (l<r&&nums[l]==nums[l-1]){
                        l++;
                    }
                    while (l<r&&nums[r]==nums[r+1]){
                        r--;
                    }
                }else if(nums[l]+nums[r]<target){
                    l++;
                }else {
                    r--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Main15().threeSum(new int[]{
                3,0,-2,-1,1,2
        }));
    }
}
