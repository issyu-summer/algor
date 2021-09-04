package dfs;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/max-area-of-island/">695.岛屿的最大面积</a><br/>
 * 从任意节点搜索面积（dfs）->选出最大的
 */
public class Main695 {

    int row,col;
    public int maxAreaOfIsland(int[][] grid) {
        int res=0;
        for (int i = 0; i <(row=grid.length); i++) {
            for (int j = 0; j < (col = grid[0].length); j++) {
                res=Math.max(res,dfs(grid,i,j));
            }
        }
        return res;
    }

    private int dfs(int[][] grid, int i, int j) {
        if(cross(i,j)||grid[i][j]==0){
            return 0;
        }
        change(grid,i,j);
        int res=1;
        res+=dfs(grid,i-1,j);
        res+=dfs(grid,i,j-1);
        res+=dfs(grid,i+1,j);
        res+=dfs(grid,i,j+1);
        return res;
    }

    private void change(int [][]ar,int i,int j){
        ar[i][j]=0;
    }
    private boolean cross(int i,int j){
        return i<0||j<0||i>=row||j>=col;
    }
}
