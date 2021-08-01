package sort;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class QuickSort extends Sort{

    public static void sort(Comparable[] a) {
        quickSort(a,0,a.length-1);
    }

    public static void quickSort(Comparable []a,int l,int r){
        if(l>=r){
            return;
        }
        int i=l,j=r;
        while (i<j){
            while (i<j&&!less(a[j],a[l])){
                j--;
            }
            while (i<j&&less(a[i],a[l])){
                i++;
            }
            exchange(a,i,j);
        }
        exchange(a,i,l);
        quickSort(a,l,i-1);
        quickSort(a,i+1,r);
    }
}
