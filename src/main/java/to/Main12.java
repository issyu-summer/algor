package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main12 {


    //矩阵中的路径
    private boolean[][]visited;
    private int row,col;
    private char []ar;
    public boolean exist(char[][] board, String word) {
        row=board.length;
        col=board[0].length;
        visited=new boolean[row][col];
        ar=word.toCharArray();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(backTrace(board,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backTrace(char [][]board,int i,int j,int deep){
        if(cross(i,j)||visited[i][j]||board[i][j]!=ar[deep]){
            return false;
        }
        if (deep == ar.length - 1) {
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
    private boolean cross(int i,int j){
        return i<0||j<0||i>=row||j>=col;
    }

}
