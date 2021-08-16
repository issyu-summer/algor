package to;

import java.util.Arrays;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Sort {

    static int count=0;
    public static void mergeSort(int[]ar){
        int l=0,r=ar.length-1;
        mergeSort(ar,l,r);
    }

    private static void mergeSort(int[] ar, int l, int r) {
        if(l>=r){
            return;
        }
        int m=l+((r-l)>>1);
        mergeSort(ar,l,m);
        mergeSort(ar,m+1,r);
        merge(ar,l,m,r);
    }

    private static void merge(int[] ar, int l, int m, int r) {
        int []tmp=new int[r-l+1];
        int t=0;
        int i=l,j=m+1;
        while (i<=m&&j<=r){
            if(ar[i]<=ar[j]){
                tmp[t++]=ar[i++];
            }else {
                count+=(m-i+1);
                tmp[t++]=ar[j++];
            }
        }
        while (i<=m){
            tmp[t++]=ar[i++];
        }
        while (j<=r){
            tmp[t++]=ar[j++];
        }
        t=0;
        while (l<=r){
            ar[l++]=tmp[t++];
        }
    }

    public static void main(String[] args) {
        int[] ar = {
                7,5,6,4
        };
        Sort.mergeSort(ar);
        System.out.println(Arrays.toString(ar));
        System.out.println(Sort.count);
    }
}
