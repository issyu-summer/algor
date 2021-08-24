package code_top.byte_dance;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main41 {

    public int firstMissingPositive(int[] nums) {
        int len,abs;
        for (int i = 0; i < (len = nums.length); i++) {
            if(nums[i]<0){
                nums[i]=len+1;
            }
        }
        for (int i = 0; i < len; i++) {
            abs=Math.abs(nums[i]);
            if(abs<=len){
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
