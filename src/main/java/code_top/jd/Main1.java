package code_top.jd;

import java.util.*;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        List<int[]> list=new ArrayList<>();
        for (int j = 0; j < n; j++) {
            list.add(new int[]{
                    in.nextInt(),in.nextInt()
            });
        }
        if (n == 0||n==1) {
            System.out.println(0);
            return;
        }
        int res=0;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j <list.size() ; j++) {
                if(map.get(i)==j){
                    continue;
                }
                if(Math.abs(list.get(i)[0]-list.get(j)[0])==Math.abs(list.get(i)[1]-list.get(j)[1])){
                    res++;
                    if(map.containsKey(i)){
                        res++;
                        map.put(map.get(i),j);
                    }
                    map.put(i,j);
                }
            }
        }
        System.out.println(res);
    }
}
