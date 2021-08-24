package code_top.red_book;

import java.util.*;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner in;
        int n = (in=new Scanner(System.in)).nextInt();
        int white=0;
        int black=0;
        int empty=0;
        int res=0;
        List<int []>energy=new ArrayList<>();
//        Map<Integer,int[]>map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            int t=in.nextInt();
            if(t==1){
                white++;
            }else if(t==2){
                black++;
            }else if(t==0) {
                empty++;
                int w=in.nextInt();
                int b=in.nextInt();
                energy.add(new int[]{
                        w,b
                });
            }
        }
        if(Math.abs(white-black)>empty){
            System.out.println(-1);
        }
        int t=0;
        //白黑平衡
        if(white>black){
            energy.sort((v1,v2)->(v1[1]-v2[1]));
            for (int i = 0; i < white - black; i++) {
                res+=energy.get(i)[1];
                t++;
            }
        }else {
            energy.sort((v1,v2)->(v1[0]-v2[0]));
            for (int i = 0; i < white - black; i++) {
                res+=energy.get(i)[0];
                t++;
            }
        }
        //放满还需放几个
        int remain=n-white*2;
        List<int []>tmp=new ArrayList<>();
        for (int i = t; i < energy.size(); i++) {
            tmp.add(energy.get(i));
        }
        Main1.row=tmp.size();
        Main1.col=2;
        Main1.visited=new boolean[tmp.size()][2];
        backTrace(tmp,0,0);
        Main1.path=0;
        backTrace(tmp,0,1);
        System.out.println(res+Main1.min);
    }
    static int min=Integer.MAX_VALUE;
    static boolean[][] visited;
    static int row,col;
    static int path=0;
    static int count=0;
    private static void backTrace(List<int []>ar,int i,int j){
        if(cross(i,j)||visited[i][j]){
            return;
        }
        count++;
        path+=ar.get(i)[j];
        if(count==ar.size()){
            min=Math.min(min,path);
            return;
        }
        backTrace(ar,i+1,j);
        backTrace(ar,i+1,j+1);
        if(j==col-1){
            backTrace(ar,i+1,j-1);
        }
        path-=ar.get(i)[j];
    }

    private static boolean cross(int i, int j) {
        return i<0||j<0||i>=row||j>=col;
    }

}
