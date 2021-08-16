package sort;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class MergeSort extends Sort {

    public static void sort(int []ar){
        int []tmp=new int[ar.length];
        sort(ar,0, ar.length-1,tmp);
    }
    private static void sort(int []ar,int l,int r,int []tmp){
        if(l>=r){
            return;
        }
        int m=l+((r-l)>>1);
        sort(ar,l,m,tmp);
        sort(ar,m+1,r,tmp);
        merge(ar,l,m,r,tmp);
    }


    /**
     * merge中全部是等号
     */
    private static void merge(int[] ar, int l, int m, int r,int []tmp) {
        int i=l,j=m+1;
        int t=0;
        while (i<=m&&j<=r){
            if(ar[i]<ar[j]){
                tmp[t++]=ar[i++];
            }else {
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
            ar[l++]= tmp[t++];
        }
    }


    public static void main(String[] args) {
        int[] a1 = new int[]{
                1, 3, 4, 6, 7, 9, 2, 4, 3, 1, 5, 6, 3, 7, 7, 8, 9, 10, 12, 34, 56, 78941, 1223, 888
        };
        MergeSort.sort(a1);
        System.out.println(Arrays.toString(a1));

    }
}
