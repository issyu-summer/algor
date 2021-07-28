package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main33 {

    public int search(int[] nums, int target) {
        int len=nums.length;
        if(len==0){
            return -1;
        }
        if(len==1&&nums[0]==target){
            return 0;
        }
        int i=0,j=len-1;
        while (i<=j){
            int mid=i+((j-i)>>1);
            if(target==nums[mid]){
                return mid;
            }
            //左半有序
            if(nums[i]<=nums[mid]){
                if(nums[i]<=target&&target<nums[mid]){
                    j=mid-1;
                }else {
                    i=mid+1;
                }
            }else {
                if(nums[mid]<target&&target<=nums[j]){
                    i=mid+1;
                }else {
                    j=mid-1;
                }
            }
        }
        return -1;
    }
}
