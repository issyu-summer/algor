package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main53sb1 {

    public int search(int[] nums, int target) {
        int i=0,j=nums.length-1;
        int count=0;
        while (i<=j){
            if(nums[i]<target){
                i++;
            }
            if(nums[j]>target){
                j--;
            }
            //短路不合理的边界
            if((i<nums.length&&j>=0)&&nums[i]==target&&target==nums[j]){
                break;
            }
        }
        if(j<i){
            return 0;
        }
        return j-i+1;
    }
}
