package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main240 {
    //搜索特殊矩阵
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int row=matrix.length;
        int col=matrix[0].length;
        int i=0,j=col-1;
        while (i<row&&j>=0){
            if(target>matrix[i][j]){
                i++;
            }else if(target<matrix[i][j]){
                j--;
            }else {
                return true;
            }
        }
        return false;
    }


}
