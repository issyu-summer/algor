package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main4 {

    //0,1,2,3,4,
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum=nums1.length+nums2.length;
        int i=sum/2,j=-1;
        if(sum%2==0){
            j=sum/2-1;
        }
        int a=0,b=0;
        int count=0;
        int x=0,y=0;
        while (a < nums1.length && b < nums2.length) {
            int tmp = 0;
            if (nums1[a] <= nums2[b]) {
                tmp = nums1[a];
                a++;
                count++;
            } else if (nums2[b] < nums1[1]) {
                tmp = nums2[b];
                b++;
                count++;
            }
            if (count == i) {
                x = tmp;
            }
            if (j != -1 && count == j) {
                y = tmp;
            }
        }
        return j==-1?x*1.0:(x+y)/2.0;
    }
}
