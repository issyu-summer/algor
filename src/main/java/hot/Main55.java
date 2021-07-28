package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main55 {

    public boolean canJump(int[] nums) {
        int len=nums.length;
        int most=0;
        for (int i = 0; i < len; i++) {
            if(i<=most){
                most=Math.max(most,i+nums[i]);
                if(most>len-1){
                    return true;
                }
            }
        }
        return false;
    }
}
