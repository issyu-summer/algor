package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main56sb2 {

    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for(int num : nums){
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }
        return ones;
    }
}
