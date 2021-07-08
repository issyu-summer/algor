package Sort;

import util.Stopwatch;

import java.util.Arrays;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Shell extends Sort {

    public static void sort(Comparable[] a) {
        int size = a.length;
        int h = 1;
        while (h < size / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < size; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exchange(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{
                6, 4, 10, 9, 7, 7, 8, 10
        };
        Stopwatch stopwatch = new Stopwatch();
        Shell.sort(a);
        System.out.println("用时" + stopwatch.elapsedTime());
        System.out.println(Arrays.toString(a));
        String[] s = new String[]{
                "S", "R", "O", "T"
        };
        Shell.sort(s);
        System.out.println(Arrays.toString(s));
    }

}
