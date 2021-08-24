package tme;

import java.util.Arrays;
import java.util.Random;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main3 {

    static Random random=new Random();
    public static int [] quickSort(int []ar){
        quickSort(ar,0,ar.length-1);
        return ar;
    }

    private static void quickSort(int []ar,int l,int r){
        if(l>=r){
            return;
        }
        int tmp = random.nextInt(r - l + 1) + l;
        swap(ar,l,tmp);
        int i=l,j=r;
        while (i<j){
            while (i<j&&ar[j]>=ar[l]){
                j--;
            }
            while (i<j&&ar[i]<=ar[l]){
                i++;
            }
            swap(ar,i,j);
        }
        swap(ar,i,l);
        quickSort(ar,l,i-1);
        quickSort(ar,i+1,r);
    }


    private static void swap(int []ar,int i,int j){
        int tmp=ar[i];
        ar[i]=ar[j];
        ar[j]=tmp;
    }

    public static void main(String[] args) {
        int[] ar = {
                1, 5, 564, 45546, 654, 5656, -12, 5
        };
        Main3.quickSort(ar);
        System.out.println(Arrays.toString(ar));
    }

}
