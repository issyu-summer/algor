package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main12 {

    private boolean[][] visited;
    private int row;
    private int col;
    private char[] chars;
    private char[][] board;

    public boolean exist(char[][] board, String word) {
        row = board.length;
        col = board[0].length;
        visited = new boolean[row][col];
        chars = word.toCharArray();
        this.board = board;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                //从任意起点开始，成功则成功
                if (traceBack(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean traceBack(int i, int j, int k) {
        //越界，字符相等，访问过直接返回false
        if (cross(i, j) || !eq(i, j, k) || visited[i][j]) {
            return false;
        }
        //长度达标返回true
        if (k == chars.length - 1) {
            return true;
        }
        //标记为已经访问过
        visited[i][j] = true;
        //上下左右四个方向，有一个成功即成功
        boolean res = traceBack(i - 1, j, k + 1) || traceBack(i + 1, j, k + 1) || traceBack(i, j - 1, k + 1) || traceBack(i, j + 1, k + 1);
        //回溯
        visited[i][j] = false;
        return res;
    }

    //越界
    private boolean cross(int i, int j) {
        return i < 0 || j < 0 || i >= row || j >= col;
    }

    //字符相等
    private boolean eq(int i, int j, int k) {
        return board[i][j] == chars[k];
    }

}
