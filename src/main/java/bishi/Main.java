package bishi;

import java.util.Scanner;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int k=s.nextInt();
        int[]ar=new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]=s.nextInt();
        }
        int l = 0,r=0;
        int sum1=0;int n1=k;
        for (int i = 0; i < k; i++) {
            sum1+=ar[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+k-1; j < n; j++) {
                int t1=i,t2=j;
                int sum2=0;
                while (t1<=t2){
                    sum2+=ar[t1];
                    t1++;
                }
                int n2,a1,a2;
                if((a1=sum1* (n2=(j - i + 1)))<(a2=(sum2*n1))){
                    n1=n2;
                    sum1=sum2;
                    l=i;
                    r=j;
                }else if(a1==a2){
                    if(r-l<j-i){
                        l=i;
                        r=j;
                    }else if(r-l==j-i) {
                        if(l>i){
                            l=i;
                            r=j;
                        }
                    }
                }
            }
        }
        System.out.println(l+" "+r);
    }
}
