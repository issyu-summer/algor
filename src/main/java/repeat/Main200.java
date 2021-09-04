package repeat;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main200 {
    int res,row,col;
    public int numIslands(char[][] grid) {
        res=0;
        for (int i = 0; i < (row=grid.length); i++) {
            for (int j = 0; j < (col=grid[0].length); j++) {
                if(grid[i][j]=='1'){
                    res++;
                    backTrace(grid,i,j);
                }
            }
        }
        return res;
    }

    private void backTrace(char[][] grid, int i, int j) {
        if(cross(i,j)||water(grid,i,j)){
            return;
        }
        change(grid,i,j);
        backTrace(grid,i-1,j);
        backTrace(grid,i+1,j);
        backTrace(grid,i,j-1);
        backTrace(grid,i,j+1);
    }

    private void change(char[][] grid, int i, int j) {
        grid[i][j]='0';
    }

    private boolean water(char[][] grid, int i, int j) {
        return grid[i][j]=='0';
    }

    private boolean cross(int i, int j) {
        return i<0||j<0||i>=row||j>=col;
    }
}
