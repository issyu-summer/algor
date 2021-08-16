package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main47 {

    //礼物的最大价值
    public int maxValue(int[][] grid) {
        int row,col=1;
        for (int i = 0; i < (row = grid.length); i++) {
            for (int j = 0; j < (col=grid[0].length); j++) {
                if(i==0&&j==0){
                    continue;
                }
                if(i==0) {
                    grid[i][j] += grid[i][j-1];
                }else if(j==0){
                    grid[i][j]+=grid[i-1][j];
                }else {
                    grid[i][j]+=Math.max(grid[i-1][j],grid[i][j-1]);
                }
            }
        }
        return grid[row-1][col-1];
    }
}
