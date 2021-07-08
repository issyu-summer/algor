package Sort;

import util.Stopwatch;

import java.util.Arrays;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Insertion extends Sort {

    public static void sort(Comparable[] a) {
        int size = a.length;
        for (int i = 1; i < size; i++) {
            //a[j]左边都是有序的
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exchange(a, j, j - 1);
            }
        }
    }

    public static void sortQ(Comparable[] a) {
        //TODO
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{
                6, 4, 10, 9, 7, 7, 8, 10
        };
        Stopwatch stopwatch = new Stopwatch();
        Insertion.sort(a);
        System.out.println("用时" + stopwatch.elapsedTime());
        System.out.println(Arrays.toString(a));
        String[] s = new String[]{
                "S", "R", "O", "T"
        };
        Insertion.sortQ(s);
        System.out.println(Arrays.toString(s));
    }
}
