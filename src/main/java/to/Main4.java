package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main4 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int row,col;
        if((row=matrix.length)==0){
            return false;
        }
        col=matrix[0].length;
        int i=0,j=col-1,tmp;
        while (i<row&&j>=0){
            if((tmp=matrix[i][j])>target){
                j--;
            }else if(tmp<target){
                i++;
            }else {
                return true;
            }
        }
        return false;
    }
}
