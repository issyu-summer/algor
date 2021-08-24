package code_top.byte_dance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main15 {
    List<List<Integer>> res;
    public List<List<Integer>> threeSum(int[] nums) {
        res=new ArrayList<>();
        int len;
        if((len=nums.length)<3){
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < len-2; i++) {
            if(nums[i]>0){
                break;
            }
            //去重
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int sum= -nums[i];
            int l=i+1,r=len-1;
            while (l<r){
                if(nums[l]+nums[r]==sum){
                    res.add(List.of(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    //去重
                    while (l<r&&nums[l]==nums[l-1]){
                        l++;
                    }
                    while (l<r&&nums[r]==nums[r+1]){
                        r--;
                    }
                }else if(nums[l]+nums[r]<sum){
                    l++;
                }else {
                    r--;
                }
            }
        }
        return res;
    }
}
