package code_top.wangyi;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        String line=in.nextLine();
        String[] s = line.split(" ");
        int min=Integer.MAX_VALUE;
        int t;
        for (String value : s) {
            list.add((t=Integer.parseInt(value)));
            min=Math.min(min,t);
        }
        int minIndex = list.indexOf(min);
        int res=1;
        int last=list.get(minIndex);
        int cur;
        int tmp=1;
        for (int j = minIndex +1; j < list.size(); j++) {
            if((cur=list.get(j))>last){
                res+=++tmp;
            }else {
                res++;
                tmp=1;
            }
            last=cur;
        }
        tmp=1;
        last=list.get(minIndex);
        for (int j = minIndex -1; j >=0; j--) {
            if((cur=list.get(j))>last){
                res+=++tmp;
            }else {
                res++;
                tmp=1;
            }
            last=cur;
        }
        System.out.println(res);
    }

}
