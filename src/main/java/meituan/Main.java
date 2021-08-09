package meituan;

import java.util.*;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main {
    public int[] topK(int []ar,int k){
        Queue<Integer> priorityQueue= new PriorityQueue<>(Comparator.reverseOrder());
        for (int n:ar) {
            if(priorityQueue.size()<k){
                priorityQueue.add(n);
            }else if(priorityQueue.peek()>=n){
                priorityQueue.poll();
                priorityQueue.add(n);
            }
        }
        int []res=new int[priorityQueue.size()];
        int len=priorityQueue.size();
        for (int i = 0; i < len; i++) {
            res[i]=priorityQueue.poll();
        }
        return res;
    }
    public static void main(String[] args) {
        int g;
        Scanner scanner=new Scanner(System.in);
        g=scanner.nextInt();
        while(g!=0){
            int n,k;
            n= scanner.nextInt();
            k=scanner.nextInt();
            int []ar=new int[n];
            for (int i = 0; i < n; i++) {
                ar[i]=scanner.nextInt();
            }
            ar=new Main().topK(ar,k);
            if(ar[k-1]>=n){
                System.out.println("NO");
            }else {
                System.out.println("YES");
                System.out.println(ar[k-1]+1);
            }
            g--;
        }
    }
}
