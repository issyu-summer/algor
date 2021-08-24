package code_top.wangyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1 {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        String s= in.nextLine();
        String[] ar = s.split(" ");
        for (String value : ar) {
            list.add(Integer.parseInt(value));
        }
        int m=in.nextInt();
        int res=0;
        list.sort((v1,v2)->(v1-v2));
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>=m){
                continue;
            }
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i)>=0&&list.get(j)>m){
                    continue;
                }
                if(list.get(i)+list.get(j)<=m){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
