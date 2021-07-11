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
                if (traceBack(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean traceBack(int i, int j, int k) {
        if (cross(i, j) || !eq(i, j, k) || visited[i][j]) {
            return false;
        }
        if (k == chars.length - 1) {
            return true;
        }
        visited[i][j] = true;
        boolean res = traceBack(i - 1, j, k + 1) || traceBack(i + 1, j, k + 1) || traceBack(i, j - 1, k + 1) || traceBack(i, j + 1, k + 1);
        visited[i][j] = false;
        return res;
    }

    private boolean cross(int i, int j) {
        return i < 0 || j < 0 || i >= row || j >= col;
    }

    private boolean eq(int i, int j, int k) {
        return board[i][j] == chars[k];
    }

}
