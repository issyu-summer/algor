package hot;

import java.util.Arrays;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=nums[0]+nums[1]+nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            if(i>0&&nums[i]==nums[i-1]) continue;
            int l=i+1,r=nums.length-1;
            while (l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(Math.abs(sum-target)<Math.abs(res-target)){
                    res=sum;
                }
                if(sum<target){
                    l++;
                    while (l<r&&nums[l]==nums[l-1]){
                        l++;
                    }
                }else {
                    r--;
                    while (l<r&&nums[r]==nums[r+1]){
                        r--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(
                new Main16().threeSumClosest(new int[]{
                        1,1,48,50,99,100,103,333,333
                },250));
    }
}
