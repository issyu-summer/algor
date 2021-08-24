package tme;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main2 {

    public List<Integer> repeat(int []a,int[] b){
        List<Integer>  res=new ArrayList<>();
        int la=a.length,lb=b.length;
        Set<Integer> set=new HashSet<>();
        if(la<lb){
            for (int j : a) {
                set.add(j);
            }
            for (int j : b) {
                if (!set.add(j)) {
                    res.add(j);
                }
            }
        }else {
            for (int j : b) {
                set.add(j);
            }
            for (int j : a) {
                if (!set.add(j)) {
                    res.add(j);
                }
            }
        }
        return res.stream().distinct().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(new Main2().repeat(new int[]{
                4,9,5
        },new int[]{
                9,4,9,8,4
        }));
    }

}
