package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main11 {

    //旋转数组中的最小数字、二分变形
    public int minArray(int[] numbers) {
        int l=0,r=numbers.length-1;
        while (l<=r){
            int m=l+((r-l)>>1);
            if(numbers[m]<numbers[r]){
                r=m;
            }else if(numbers[m]>numbers[r]){
                l=m+1;
            }else {
                r--;
            }
        }
        return numbers[l];
    }
}
