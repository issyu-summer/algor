package code_top.wangyi;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Solution {

    int row,col;
    int cost;
    int min;
    public int minSailCost (int[][] input) {
        // write code here
        min=Integer.MIN_VALUE;
        row=input.length;
        col=input[0].length;
        cost=0;
        if(backTrace(input,0,0)){
            return cost;
        }else {
            return -1;
        }
    }

    private boolean backTrace(int [][]ar,int i,int j){
        if(cross(i,j)||ar[i][j]==2){
            return false;
        }
        if (i != 0 || j != 0) {
            cost += ar[i][j] == 1 ? 1 : 2;
        }
        if(i==row-1&&j==col-1){
            return true;
        }
        boolean b = true;
        if(!cross(i+1,j)&&!cross(i,j+1)&&ar[i+1][j]>ar[i][j+1]){
            b= backTrace(ar,i,j+1);
        }else if(!cross(i+1,j)&&!cross(i,j+1)&&ar[i+1][j]<=ar[i][j+1]){
            b= backTrace(ar,i+1,j);
        }
        cost-=ar[i][j]==1?1:2;
        return b;
    }

    private boolean cross(int i,int j){
        return i<0||j<0||i>=row|j>=col;
    }


}

