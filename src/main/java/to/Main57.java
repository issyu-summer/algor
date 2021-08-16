package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main57 {
    //和为s的两个数
    public int[] twoSum(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int tmp;
        while (l<r){
            if((tmp=nums[l]+nums[r])==target){
                return new int[]{
                        nums[l],nums[r]
                };
            }else if(tmp<target){
                l++;
            }else {
                r--;
            }
        }
        return new int[0];
    }
}
