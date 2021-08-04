package hot;

import java.util.*;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main347 {
    //前K个高频--->前K个频数最大--->
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<int[]> queue=new PriorityQueue<>(Comparator.comparingInt(ar -> ar[1]));
        for (Integer key:map.keySet()){
            Integer val=map.get(key);
            if(queue.size()<k){
                queue.add(new int[]{
                        key,val
                });
            }else if (queue.peek()[1] < val) {
                queue.poll();
                queue.add(new int[]{
                        key, val
                });
            }
        }
        int []res=new int[k];
        for (int i = 0; i < k; i++) {
            res[i]=queue.poll()[0];
        }
        return res;
    }

    public int[] topKFrequent1(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        if(map.size()==1){
            return nums;
        }
        List<int []>list=new ArrayList<>();
        for(int key:map.keySet()){
            int val=map.get(key);
            list.add(new int[]{
                    key,val
            });
        }
        this.k=k;
        quickSort(list,0,list.size()-1);
        int []res=new int[k];
        for (int i = 0; i < k; i++) {
            res[i]=list.get(i)[0];
        }
        return res;
    }
    Random random=new Random();
    private int k;
    private List<int []> quickSort(List<int []> list,int l,int r){
        if(l>r){
            return list.subList(0,k);
        }
        int random = this.random.nextInt(r - l + 1) + l;
        swap(list,random,l);
        int i=l,j=r;
        while (i<j){
            while (i<j&&list.get(j)[1]<=list.get(l)[1]){
                j--;
            }
            while (i<j&&list.get(i)[1]>=list.get(l)[1]){
                i++;
            }
            swap(list,i,j);
        }
        swap(list,i,l);
        if(r==l){
            return list.subList(0,k);
        }
        if(k<i) {
            quickSort(list,l,i-1);
        }
        if(k>i) {
            quickSort(list, i + 1, r);
        }
        return list.subList(0,k);
    }

    private void swap(List<int []> list,int i,int j){
        Collections.swap(list,i,j);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main347().topKFrequent1(new int[]{
                1, 2

        }, 2)));
    }
}
