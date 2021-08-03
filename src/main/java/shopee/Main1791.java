package shopee;

import java.util.HashSet;
import java.util.Set;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1791 {
    public int findCenter(int[][] edges) {
        Set<Integer> set=new HashSet<>();
        for (int[] edge : edges) {
            for (int j = 0; j < edges[0].length; j++) {
                if (!set.add(edge[j])) {
                    return edge[j];
                }
            }
        }
        return 0;
    }
}
