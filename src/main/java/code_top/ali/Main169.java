package code_top.ali;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main169 {

    //多数元素
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
