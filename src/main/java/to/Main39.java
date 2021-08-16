package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main39 {

    //数组中出现次数超过一半的数字
    public int majorityElement(int[] nums) {
       int n=0,votes=0;
        for (int i:nums) {
            if(votes==0){
                n=i;
            }
            votes+=n==i?1:-1;
        }
        return n;
    }
}
