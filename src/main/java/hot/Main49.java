package hot;

import java.util.*;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        Map<String, List<String>> map=new HashMap<>();
        for (String s:strs) {
            char[] ar = s.toCharArray();
            Arrays.sort(ar);
            String t=String.valueOf(ar);
            List<String> list=map.getOrDefault(t, new ArrayList<>());
            list.add(s);
            map.put(t,list);
        }
        map.forEach((k,v)->{
            res.add(new ArrayList<>(v));
        });
        return res;
    }
}
