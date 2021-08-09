package jindian;

import java.util.Scanner;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main2 {

    public static int judge(int n,int t,int c,int []ar){
        int i=0,j=i+c-1;boolean ok=true;int count=0;
        while(i<n&&j<n){
            for (int k = i; k <= j; k++) {
                if(ar[k]>t){
                    i=k+1;
                    j=i+c-1;
                    ok=false;
                    break;
                }else {
                    ok=true;
                }
            }
            if(ok){
                i++;
                j++;
                count++;
            }
        }
        return count;
    }

    public static int judge1(int n,int t,int c,int []ar){
        if(n==1){
            if(ar[0]>t){
                return 0;
            }else {
                return 1;
            }
        }
        int sum=n-c+1;int count;
        for (int i = 0; i < n; i++) {
            if(ar[i]>t){
                int l=i;
                while (l<n){
                    if(ar[l]>t){
                        l++;
                    }else {
                        break;
                    }
                }
                count=l-i;
                i=l;
                if(count>1){
                    sum=sum-count-1;
                }else {
                    sum=sum-count*2;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=s.nextInt();
        int c=s.nextInt();
        int []ar=new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]=s.nextInt();
        }
        System.out.println(Main2.judge1(n,t,c,ar));
    }
}
