package code_top.byte_dance;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/sqrtx/">69.x的平方根</a><br/>
 * x的平方根范围（0~sqrt(x)）+二分
 */
public class Main69 {

    public int mySqrt(int x) {
        int l=0,r=x,res=-1;
        while (l<=r){
            int m=(l+r)>>1;
            if((long)m*m<=x){
                l=m+1;
                res=m;
            }else {
                r=m-1;
            }
        }
        return res;
    }
}
