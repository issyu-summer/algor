package sort;

import java.util.Arrays;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class MergeSort extends Sort {

    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    /**
     * 自顶向下
     */
    private static void sort(Comparable[] a, int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = low + (high - low) / 2;
        sort(a, low, mid);
        sort(a, mid + 1, high);
        if (less(a[mid], a[mid + 1])) {
            return;
        }
        merge(a, low, mid, high);
    }

    /**
     * 自底向上
     */
    public static void sortBu(Comparable[] a) {
        int size = a.length;
        aux = new Comparable[size];
        for (int sz = 1; sz < size; sz *= 2) {
            for (int low = 0; low < size - sz; low += sz * 2) {
                merge(a, low, low + sz - 1, Math.min(low + sz * 2 - 1, size - 1));
            }
        }
    }

    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
    }


    public static void main(String[] args) {
        Integer[] a1 = new Integer[]{
                1, 3, 4, 6, 7, 9, 2, 4, 3, 1, 5, 6, 3, 7, 7, 8, 9, 10, 12, 34, 56, 78941, 1223, 888
        };
        MergeSort.sortBu(a1);
        System.out.println(Arrays.toString(a1));

    }
}
