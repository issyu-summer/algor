package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main200 {

    private int row,col;
    public int numIslands(char[][] grid) {
        row=grid.length;
        col=grid[0].length;
        int count=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][]ar,int i,int j){
        if(cross(i,j)||water(ar,i,j)){
            return;
        }
        change(ar,i,j);
        dfs(ar,i-1,j);
        dfs(ar,i+1,j);
        dfs(ar,i,j-1);
        dfs(ar,i,j+1);
    }
    private boolean cross(int i,int j){
        return i<0||j<0||i>=row||j>=col;
    }

    private void change(char[][]ar,int i,int j){
        ar[i][j]='0';
    }

    private boolean water(char [][]ar,int i,int j){
        return ar[i][j]=='0';
    }


}
