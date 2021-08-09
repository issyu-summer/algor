package jindian;

import java.util.Scanner;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1 {

    private static int judge(int x,int y,int r){
        x=Math.abs(x);
        y=Math.abs(y);
        if(x==r&&y==r){
            return 2;
        }
        if(x==0&&y==r){
            return 2;
        }
        if(y==0&&x==r){
            return 2;
        }
        if(x==r&&y<r){
            return 3;
        }
        if(y==r&&x<r){
            return 3;
        }
        if(x==r||y==r){
            return 1;
        }
        if(Math.sqrt(x*x*1.0+y*y*1.0)==r){
            return 3;
        }
        if(x>r&&y>r){
            return 0;
        }
        if(x<r&&y<r){
            return 4;
        }else {
            return 2;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i = s.nextInt();
        for (int j = 0; j < i; j++) {
            int x=s.nextInt();
            int y=s.nextInt();
            int r=s.nextInt();
            System.out.println(Main1.judge(x,y,r));
        }
    }
}
