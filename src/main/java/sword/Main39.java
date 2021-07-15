package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main39 {

    public int majorityElement(int[] nums) {
        int x=0,votes=0;
        for (int n:nums) {
            if(votes==0){
                x=n;
            }
            votes+=x==n?1:-1;
        }
        return x;
    }
}
