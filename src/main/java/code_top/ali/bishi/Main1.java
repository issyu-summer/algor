package code_top.ali.bishi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner in;
        int n=(in=new Scanner(System.in)).nextInt();
        for (int i = 0; i < n; i++) {
            int num=in.nextInt();
            int []x=new int[num];
            int []y=new int[num];
            for (int j = 0; j < num; j++) {
                x[j]=in.nextInt();
            }
            for (int j = 0; j < num; j++) {
                y[j]=in.nextInt();
            }
            System.out.println(statics(x,y));
        }

    }

    private static int statics(int []x,int []y){
        int res=0;
        for (int i = 0; i < x.length; i++) {
            for (int j = i+1; j < x.length; j++) {
                if(x[i]<x[j]&&y[i]<y[j]){
                    res++;
                }
                if(x[i]>x[j]&&y[i]>y[j]){
                    res++;
                }
            }
        }
        return res;
    }
}
