package code_top.byte_dance;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main33 {

    //在有序数组中搜索
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while (l<=r){
            int m=l+((r-l)>>1);
            if(nums[m]==target){
                return m;
            }
            if(nums[m]>=nums[l]){
                //并不知道target和nums[m]的关系,必须带等号
                if(nums[l]<=target&&target<nums[m]){
                    r=m-1;
                }else {
                    l=m+1;
                }
            }else {
                if(nums[m]<target&&target<=nums[r]){
                    l=m+1;
                }else {
                    r=m-1;
                }
            }
        }
        return -1;
    }
}
