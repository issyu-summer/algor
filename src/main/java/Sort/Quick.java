package sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Quick {

    private final Random random=new Random();
    public void quickSort(int []ar,int l,int r){
        if(l>=r){
            return;
        }
        int ex = random.nextInt(r - l + 1) + l;
        swap(ar,ex,l);
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

    private void swap(int []ar,int i,int j){
        int tmp=ar[i];
        ar[i]=ar[j];
        ar[j]=tmp;
    }

    public static void main(String[] args) {
        int []ar=new int[]{
                1,5,3,61,13,-555,151,313,1,31,231,56,8,6,5656,0
        };
        new Quick().quickSort(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));
    }
}
