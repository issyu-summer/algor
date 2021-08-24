package code_top.red_book;

import java.util.Scanner;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main2 {

    int res;
    int row;
    int col;
    int path;
    int count=0;
    boolean [][]visited;
    public Main2(int n,int t){
        this.res=0;
        this.row=n;
        this.col=n;
        visited=new boolean[n][n];
        path=n*n-t;
    }
    public static void main(String[] args) {
        Scanner in;
        int n=(in=new Scanner(System.in)).nextInt();
        char[][]ar=new char[n][n];
        int t=0;
        for (int i = 0; i < n; i++) {
            char[] chars = in.next().toCharArray();
            ar[i]=chars;
            for (int j = 0; j < n; j++) {
                if(ar[i][j]=='#'){
                    t++;
                }
            }
        }
        if(n==1){
            if(ar[0][0]=='.'){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
        Main2 main2 = new Main2(n,t);
        main2.backTrace(ar,0,0);
        System.out.println(main2.res);
    }

    private void backTrace(char [][]ar,int i,int j){
        if(cross(i,j)||visited[i][j]||ar[i][j]=='#'){
            return;
        }
        visited[i][j]=true;
        count++;
        if(i==row-1&&count==path) {
            res++;
            return;
        }
        backTrace(ar,i-1,j);
        backTrace(ar,i+1,j);
        backTrace(ar,i,j+1);
        backTrace(ar,i,j-1);
        visited[i][j]=false;
        count--;
    }

    private boolean cross(int i,int j){
        return i<0||j<0||i>=row||j>=col;
    }
}
