package jindian;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main3 {

    static List<String> res=new ArrayList<>();
    static StringBuilder sb=new StringBuilder();
    static int n;
    static int m;
    static boolean [] visited;
    static int last;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        Main3.n=n;
        Main3.m=m;
        Main3.visited=new boolean[n];
        int []ar=new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]=s.nextInt();
        }
        Main3.backTrace(ar,0,0);
        System.out.println(res.size());

    }


     public static void backTrace(int []ar,int depth,int last){
        if(depth==ar.length){
            String s=sb.toString();
            s=s.trim();
            System.out.println(s);
            res.add(s);
            return;
        }

        for (int j = 0; j < ar.length; j++) {
            if(visited[j]){
                continue;
            }
            if((j>0&&Math.abs(last-ar[j])>m)){
                continue;
            }
            sb.append(ar[j]).append(" ");
            visited[j] = true;
            backTrace(ar, depth + 1,ar[j]);
            visited[j] = false;
            sb.deleteCharAt(sb.length() - 1).deleteCharAt(sb.length() - 1);
        }
    }
}
