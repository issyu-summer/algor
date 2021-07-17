package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main56sb1{

    public int[] singleNumbers(int[] nums) {
        int n=0,m=1,x=0,y=0;
        for (int num:nums) {
            n^=num;
        }
        while ((n&m)==0){
            m<<=1;
        }
        for (int num:nums) {
            if((num&m)==0){
                x^=num;
            }else {
                y^=num;
            }
        }
        return new int[]{x,y};
    }
}
