package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main13 {

    //机器人的运动范围
    private int row;
    private int col;
    private int k;
    private boolean [][]visited;
    public int movingCount(int m, int n, int k) {
        this.row=m;
        this.col=n;
        this.k=k;
        visited=new boolean[m][n];
        return dfs(0,0);
    }

    private int dfs(int i,int j){
        if(cross(i,j)||(sum(i)+sum(j)>k)||visited[i][j]){
            return 0;
        }
        visited[i][j]=true;
        return 1+dfs(i+1,j)+dfs(i,j+1);
    }

    private int sum(int k){
        int res=0;
        while (k!=0){
            res+=k%10;
            k/=10;
        }
        return res;
    }

    private boolean cross(int i,int j){
        return i>=row||j>=col;
    }
    public static void main(String[] args) {
        int sum = new Main13().sum(155);
        System.out.println(sum);
    }
}

