package sort;

import util.Stopwatch;

import java.util.Arrays;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Selection extends Sort {

    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            //找出最小得一个
            for (int j = i + 1; j < n; j++) {
                if (less(a[j], a[minIndex])) {
                    minIndex = j;
                }
            }
            exchange(a, i, minIndex);
        }
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{
                6, 4, 10, 9, 7, 7, 8, 10
        };
        Stopwatch stopwatch = new Stopwatch();
        Selection.sort(a);
        System.out.println("用时" + stopwatch.elapsedTime());
        System.out.println(Arrays.toString(a));
        String[] s = new String[]{
                "S", "R", "O", "T"
        };
        Selection.sort(s);
        System.out.println(Arrays.toString(s));
    }
}
