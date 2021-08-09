package jindian;

import java.util.Arrays;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main0102 {
    public boolean CheckPermutation(String s1, String s2) {
        char[] ar1 = s1.toCharArray();
        char[] ar2 = s2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        return String.valueOf(ar1).equals(String.valueOf(ar2));
    }
}
