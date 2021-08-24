package code_top.yingjiao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main3 {

    int row,col;
    boolean[][]visited;
    int res;
    int limit;
    public long pathOfZeroAndOne (int[][] maze) {
        // write code here
        row=maze.length;
        col=maze[0].length;
        limit=row*col-1;
        res=0;
        visited=new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(maze[i][j]==1){
                    continue;
                }
                backTrace(maze,i,j);
            }
        }
        return res;
    }

    private void backTrace(int [][]maze,int i,int j){
        if(cross(i,j)||visited[i][j]){
            return;
        }
        if(maze[i][j]==1){
            res++;
            return;
        }
        backTrace(maze,i-1,j);
        backTrace(maze,i+1,j);
        backTrace(maze,i,j+1);
        backTrace(maze,i,j-1);
    }
    private boolean cross(int i,int j){
        return i<0||j<0||i>=row||j>=col;
    }


    public static void main(String[] args) {
        List<Integer> integerArrayList=new ArrayList<Integer>();
        List<Long> longArrayList=new ArrayList<Long>();
        List<Boolean> booleanLikedList=new LinkedList<Boolean>();

        longArrayList.add((long)10);
        integerArrayList.add(10);

        booleanLikedList.add(true);
        booleanLikedList.add(false);

        System.out.println(integerArrayList.getClass());
        System.out.println(longArrayList.getClass());
        System.out.println(booleanLikedList.getClass());
        int a=6;Integer b=6;
        int c=200;Integer d=200;
        System.out.println(c==d);
    }

}
