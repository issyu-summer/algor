package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main11 {
    public int minArray(int[] numbers) {
        int tmp = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (tmp <= numbers[i]) {
                tmp = numbers[i];
            } else {
                return numbers[i];
            }
        }
        return -1;
    }

    public int minArray1(int[] numbers) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (numbers[m] > numbers[r]) {
                l = m + 1;
            } else if (numbers[m] < numbers[l]) {
                r = m;
            } else {
                r--;
            }
        }
        return numbers[l];
    }
}
