package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main42 {

    public int trap(int[] height) {
        int lMax=0,rMax=0;
        int l=0,r=height.length-1;
        int res=0;
        while (l<r){
            lMax=Math.max(height[l],lMax);
            rMax=Math.max(height[r],rMax);
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
