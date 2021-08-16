package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main287 {
    public int findDuplicate(int[] nums) {
        int a=0;
        int len=nums.length;
        for (int i = 1; i < len; i++) {
            a^=i;
        }
        int b=0;
        for (int n:nums) {
            b^=n;
        }
        return b>a?b-a:a-b;
    }

    private int floyd(int []ar){
        int slow=0,fast=0;
        do{
            slow=ar[slow];
            fast=ar[ar[fast]];
        }while (fast!=slow);
        slow=0;
        do {
            slow=ar[slow];
            fast=ar[fast];
        }while (fast!=slow);
        return slow;
    }
}
