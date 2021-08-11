package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main53sb1 {

    public int search(int[] nums, int target) {
        return helper(nums,target)-helper(nums,target-1);
    }

    private int helper(int []ar,int target){
        int i=0,j=ar.length-1;
        while (i<=j){
            int m=i+((j-i)>>1);
            if(ar[m]<=target){
                i=m+1;
            }else {
                j=m-1;
            }
        }
        return i;
    }
}
