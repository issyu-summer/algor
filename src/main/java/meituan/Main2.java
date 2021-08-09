package meituan;

import java.util.*;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        char[] ar = s.toCharArray();
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for (char c : ar) {
            if(c!=' ') {
                set.add(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for (Character c:set) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
