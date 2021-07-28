package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main11 {

    public int maxArea(int[] height) {
        int len=height.length;
        int max=0;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j <len ; j++) {
                max=Math.max(max,(j-i)*Math.min(height[i],height[j]));
            }
        }
        return max;
    }

    //由短板决定,移动短的才有可能增大
    public int maxArea1(int []height){
        int res=0,i=0,j=height.length-1;
        while (i<j){
            res=height[i]<height[j]?
                    Math.max(res,(j-i)*height[i++]):
                    Math.max(res,(j-i)*height[j--]);
        }
        return res;
    }
}
