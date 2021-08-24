package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main3 {

    public int findRepeatNumber(int[] nums) {
        int i=0;
        while (i<nums.length){
            if(i==nums[i]){
                i++;
                continue;
            }
            if(nums[i]==nums[nums[i]]){
                return nums[i];
            }
            swap(nums,i,nums[i]);
        }
        return -1;
    }

    private void swap(int []ar,int i,int j){
        int tmp=ar[i];
        ar[i]=ar[j];
        ar[j]=tmp;
    }

}
