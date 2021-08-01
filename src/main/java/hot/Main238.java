package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main238 {

    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int []b=new int[len];
        if(len==0){
            return b;
        }
        b[0]=1;
        for (int i = 1; i < len; i++) {
            b[i]=b[i-1]*nums[i-1];
        }
        int tmp=1;
        for (int i = len-2; i >=0; i--) {
            tmp*=nums[i+1];
            b[i]*=tmp;
        }
        return b;
    }

}
