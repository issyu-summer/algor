package code_top.byte_dance;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main42 {

    //接雨水
    public int trap(int[] height) {
        //取决于短板
        int lMax=0,rMax=0;
        int l=0,r=height.length-1;
        int res=0;
        while (l<r){
            lMax=Math.max(lMax,height[l]);
            rMax=Math.max(rMax,height[r]);
            if(height[l]<height[r]){
                res+=lMax-height[l];
                l++;
            }else {
                res+=rMax-height[r];
                r--;
            }
        }
        return res;
    }
}
