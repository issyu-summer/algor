/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Test {


    public static int search(int []ar,int target){
        int l=0,r=ar.length-1;
        while (l<=r){
            int m=l+((r-l)>>1);
            if(target>ar[m]){
                l=m+1;
            }else if(target<ar[m]){
                r=m-1;
            }else{
                return m;
            }
        }
        return l;
    }

    public static int  helper(int []ar,int target){
        int i = 0, j = ar.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(ar[m] <= target) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        int[] ar = {
                5,7,7,8,8,10
        };
        System.out.println(Test.helper(ar,8)-Test.helper(ar,7));
    }
}
