package repeat;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/first-missing-positive/">41.缺失的第一个正数</a><br/>
 * 背过
 */
public class Main41 {

    public int firstMissingPositive(int[] nums) {
        int len,abs;
        for (int i = 0; i < (len = nums.length); i++) {
            if(nums[i]<=0){
                nums[i]=len+1;
            }
        }
        for (int i = 0; i < len; i++) {
            if((abs=Math.abs(nums[i]))<=len){
                nums[abs-1]=-Math.abs(nums[abs-1]);
            }
        }
        for (int i = 0; i < len; i++) {
            if(nums[i]>0){
                return i+1;
            }
        }
        return len+1;
    }

}
