package sword;

import java.util.*;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main40 {

    public int[] getLeastNumbers(int[] arr, int k) {
        //学习以下堆排序再回来做
        Queue<Integer> priorityQueue= new PriorityQueue<>(Comparator.reverseOrder());
        for (int n:arr) {
            if(priorityQueue.size()<k){
                priorityQueue.add(n);
            }else if(priorityQueue.peek()>n){
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

    private int k;
    public int[] getLeastNumbers1(int[] arr, int k) {
        if(k>arr.length){
            return arr;
        }
        this.k=k;
        return quickSort(arr,0,arr.length-1);

    }
    Random random=new Random();
    //快速排序必须先移动右指针！！！
    private int[] quickSort(int []ar,int l,int r){
        if(l>r){
            return Arrays.copyOf(ar, k);
        }
        int index=random.nextInt(r-l+1)+l;
        swap(ar,l,index);
        int i = l, j = r;
        while (i < j) {
            while (i < j && ar[j] >= ar[l]) {
                j--;
            }
            while (i < j && ar[i] <= ar[l]) {
                i++;
            }
            swap(ar, i, j);
        }
        swap(ar, i, l);
        if (i > k) return quickSort(ar, l, i - 1);
        if (i < k) return quickSort(ar, i + 1, r);
        return Arrays.copyOf(ar, k);
    }

    private void swap(int []ar,int i,int j){
        int tmp=ar[i];
        ar[i]=ar[j];
        ar[j]=tmp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main40().getLeastNumbers1(new int[]{0, 1}, 2)));
    }
}
