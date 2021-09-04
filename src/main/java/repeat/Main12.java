package repeat;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/">sw12.矩阵种的路径</a><br/>
 * 回溯
 */
public class Main12 {
    int row,col;
    boolean [][]visited;
    String str;
    public boolean exist(char[][] board, String word) {
        row=board.length;
        col=board[0].length;
        visited=new boolean[row][col];
        str=word;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(backTrace(board,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backTrace(char[][] board, int i, int j, int deep) {
        if(cross(i,j)||visited[i][j]||board[i][j]!=str.charAt(deep)){
            return false;
        }
        //为真的条件老是忘记
        if (deep == str.length() - 1) {
            return true;
        }
        visited[i][j]=true;
        boolean b=backTrace(board,i+1,j,deep+1)||
                backTrace(board,i-1,j,deep+1)||
                backTrace(board,i,j+1,deep+1)||
                backTrace(board,i,j-1,deep+1);
        visited[i][j]=false;
        return b;
    }

    private boolean cross(int i, int j) {
        return i<0||j<0||i>=row||j>=col;
    }


}
