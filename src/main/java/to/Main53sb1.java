package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main53sb1 {

    public int search(int[] nums, int target) {
        return helper(nums,target)-helper(nums,target-1);
    }

    private int helper(int []ar,int target){
        int l=0,r=ar.length-1;
        while (l<=r){
            int m=l+((r-l)>>1);
            if(ar[m]<=target){
                l=m+1;
            }else {
                r=m-1;
            }
        }
        return l;
    }
}
