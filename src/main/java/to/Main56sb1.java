package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main56sb1 {

    public int[] singleNumbers(int[] nums) {
        int n=0;
        for (int i:nums) {
            n^=i;
        }
        int m=1;
        while ((n&m)==0){
            m<<=1;
        }
        int x=0,y=0;
        for (int i:nums) {
            if((i&m)==0){
                x^=i;
            }else {
                y^=i;
            }
        }
        return new int[]{
                x,y
        };
    }
}
