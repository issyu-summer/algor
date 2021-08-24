package code_top.wangyi;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main4 {

    int row,col;
    boolean[][]visited;
    int cost;
    int min;
    int last;
    public int minSailCost (int[][] input) {
        // write code here
        min=Integer.MIN_VALUE;
        row=input.length;
        col=input[0].length;
        cost=0;
        int last;
        visited=new boolean[row][col];
        backTrace(input,0,0);
        return cost;
    }

    private void backTrace(int [][]ar,int i,int j){
        if(cross(i,j)||visited[i][j]||ar[i][j]==2){
            return;
        }
        visited[i][j]=true;
        if (i != 0 || j != 0) {
            last=cost;
            cost += ar[i][j] == 1 ? 1 : 2;
        }
        if(i==row-1&&j==col-1){
            return;
        }
        if(!cross(i+1,j)&&!cross(i,j+1)&&ar[i+1][j]>ar[i][j+1]){
            backTrace(ar,i+1,j);
        }else if(!cross(i+1,j)&&!cross(i,j+1)&&ar[i+1][j]<=ar[i][j+1]){
            backTrace(ar,i,j+1);
        }
        visited[i][j]=false;
        cost=last;
    }

    private boolean cross(int i,int j){
        return i<0||j<0||i>=row|j>=col;
    }

    public static void main(String[] args) {
        int[][] ar = {
                new int[]{
                        1, 1, 1, 1, 0
                },
                new int[]{
                        0,1,0,1,0
                },
                new int[]{
                        1,1,2,1,1
                },
                new int[]{
                        0,2,0,0,1
                }
        };
        System.out.println(new Main4().minSailCost(ar));
    }
}
