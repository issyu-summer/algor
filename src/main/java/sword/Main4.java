package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main4 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //从右上或者左下查找
        if (matrix.length == 0) {
            return false;
        }
        int i = 0, j = matrix[0].length - 1;
        while (i < matrix.length && j > -1) {
            if (target > matrix[i][j]) {
                i++;
            } else if (target < matrix[i][j]) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }
}
