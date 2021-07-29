package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main79 {

    private char[]ar;
    private int row,col;
    private boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        ar=word.toCharArray();
        row=board.length;
        col=board[0].length;
        visited=new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(backTrace(board,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }


    private boolean cross(int i,int j){
        return i<0||j<0||i>=row||j>=col;
    }

    private boolean backTrace(char[][]board,int deep,int i,int j){
        if(cross(i,j)||visited[i][j]||ar[deep]!=board[i][j]){
            return false;
        }
        if(deep==ar.length-1){
            return true;
        }
        visited[i][j]=true;
        boolean b=backTrace(board,deep+1,i-1,j)||backTrace(board,deep+1,i+1,j)||backTrace(board,deep+1,i,j-1)||backTrace(board,deep+1,i,j+1);
        visited[i][j]=false;
        return b;
    }

}
