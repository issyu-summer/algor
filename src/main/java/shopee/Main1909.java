package shopee;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1909 {
    public boolean canBeIncreasing(int[] nums) {
        boolean asc=true;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]>=nums[i+1]){
               if(asc){
                   if(i-1<0||nums[i+1]>nums[i-1]){
                       asc=false;
                   } else if(i + 2 >= nums.length || nums[i + 2] > nums[i]){
                       asc=false;
                   }else {
                       return false;
                   }
               }else {
                   return false;
               }
            }
        }
        return true;
    }
}
