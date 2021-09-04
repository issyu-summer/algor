package repeat;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/">sw57.和为s的两个数字</a><br/>
 */
public class Main57 {
    public int[] twoSum(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int sum;
        while (l<r){
            if(target==(sum=nums[l]+nums[r])){
                return new int[]{
                        nums[l],nums[r]
                };
            }else if(target>sum){
                l++;
            }else {
                r--;
            }
        }
        return new int[0];
    }
}
