package slide_window;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/minimum-size-subarray-sum/">209.长度最小的子数组</a><br/>
 */
public class Main209 {

    public int minSubArrayLen(int target, int[] nums) {
        int len;
        if((len=nums.length)==0){
            return 0;
        }
        int res=len;
        int start=0,end=0;
        int sum=0;
        while (end<len){
            sum+=nums[end];
            while (sum>=target){
                res=Math.min(res,end-start+1);
                sum-=nums[start];
                start++;
            }
            end++;
        }
        return res==len?0:res;
    }
}
