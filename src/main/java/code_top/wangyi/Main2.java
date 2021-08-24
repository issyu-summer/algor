package code_top.wangyi;

import java.util.*;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main2 {

    List<Character> list;

    {
        list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.add('f');
        list.add('g');
        list.add('h');
        list.add('i');
        list.add('j');
        list.add('k');
        list.add('l');
        list.add('m');
        list.add('n');
        list.add('o');
        list.add('p');
        list.add('q');
        list.add('r');
        list.add('s');
        list.add('t');
        list.add('u');
        list.add('v');
        list.add('w');
        list.add('x');
        list.add('y');
        list.add('z');
    }

    Map<Character,Character> invert;

    {
        invert = new HashMap<>();
        invert.put('a', 'z');
        invert.put('b', 'y');
        invert.put('c', 'x');
        invert.put('d', 'w');
        invert.put('e', 'v');
        invert.put('f', 'u');
        invert.put('g', 't');
        invert.put('h', 's');
        invert.put('i', 'r');
        invert.put('j', 'q');
    }

    public char findKthBit (int n, int k) {
        Map<Character, Character> m = new HashMap<>();
        m.put('k', 'p');
        m.put('l', 'o');
        m.put('m', 'n');
        invert.putAll(m);
        Map<Character, Character> m1 = new HashMap<>();
        m1.put('n', 'm');
        m1.put('o', 'l');
        m1.put('p', 'k');
        invert.putAll(m1);
        Map<Character, Character> m2 = new HashMap<>();
        m2.put('z', 'a');
        m2.put('y', 'b');
        m2.put('x', 'c');
        m2.put('w', 'd');
        m2.put('v', 'e');
        m2.put('u', 'f');
        m2.put('t', 'g');
        m2.put('s', 'h');
        m2.put('r', 'i');
        m2.put('q', 'j');
        invert.putAll(m2);
        String []ar=new String[n+1];
        ar[1]="a";
        for (int i = 2; i <=n; i++) {
            ar[i]=ar[i-1]+list.get(i-1)+invertAndReverse(ar[i-1]);
        }
        return ar[n].toCharArray()[k-1];
    }

    private String invertAndReverse(String s){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(invert.get(s.charAt(i)));
        }
        return sb.reverse().toString();
    }

}
