package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main31 {
    public void nextPermutation(int[] nums) {
        int len=nums.length;
        int i=len-2;
        while (i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=len-1;
            while (j>=0&&nums[i]>=nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        reverser(nums,i+1);
    }

    private void swap(int []ar,int i,int j){
        int tmp=ar[i];
        ar[i]=ar[j];
        ar[j]=tmp;
    }

    private void reverser(int []ar,int start){
        int i=start,j=ar.length-1;
        while (i<j){
            swap(ar,i,j);
            i++;
            j--;
        }
    }
}
