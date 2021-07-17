package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main57sb1 {

    public int[] twoSum(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while (i<=j){
            if(nums[i]+nums[j]<target){
                i++;
            } else if(nums[i]+nums[j]>target){
                j--;
            } else {
                break;
            }
        }
        return new int[]{
                nums[i],nums[j]
        };
    }
}
