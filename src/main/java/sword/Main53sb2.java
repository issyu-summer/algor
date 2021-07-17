package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main53sb2 {

    public int missingNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^(i+1)^nums[i];
        }
        return ans;
    }

    public int missingNumber1(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Main53sb2().missingNumber(new int[]{
                0,1,3
        }));
    }
}
