package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main13 {

    private int row;
    private int col;
    private int k;
    private boolean[][] visited;

    public int movingCount(int m, int n, int k) {
        this.row = m;
        this.col = n;
        this.k = k;
        this.visited = new boolean[row][col];
        return dfs(0, 0);
    }

    /**
     * 数位和
     */
    private int sums(int i) {
        int s = 0;
        while (i != 0) {
            s += i % 10;
            i /= 10;
        }
        return s;
    }

    private int dfs(int i, int j) {
        if (cross(i, j) || !less(i, j, k) || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        return 1 + dfs(i + 1, j) + dfs(i, j + 1);
    }

    private boolean cross(int i, int j) {
        //没有向上和向左，不用<0
        return i < 0 || j < 0 || i >= row || j >= col;
    }

    private boolean less(int i, int j, int k) {
        return sums(i) + sums(j) <= k;
    }


}
