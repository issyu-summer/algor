package code_top.byte_dance;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int []res=new int[m+n];
        int i1=0,i2=0;
        int t=0;
        while (i1<m&&i2<n){
            if(nums1[i1]<nums2[i2]){
                res[t++]=nums1[i1++];
            }else {
                res[t++]=nums2[i2++];
            }
        }
        while (i1<m){
            res[t++]=nums1[i1++];
        }
        while (i2<n){
            res[t++]=nums1[i2++];
        }
        t=0;
        while (t<res.length){
            nums1[t]=res[t++];
        }
    }
}
