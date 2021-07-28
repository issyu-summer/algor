package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main7 {
    public int reverse(int x) {
        int tmp,res=0,last;
        while (x!=0){
            tmp=x%10;
            last=res;
            res=10*res+tmp;
            //溢出之后res会成为负数
            if(last!=res/10){
                return 0;
            }
            x/=10;
        }
        return res;
    }

    public static void main(String[] args) {
        int tmp=Integer.MAX_VALUE+1;
        System.out.println(Integer.MAX_VALUE+" "+tmp);
    }
}
