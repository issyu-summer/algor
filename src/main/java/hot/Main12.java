package hot;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main12 {

    public String intToRoman(int num) {
        //TreeMap默认 升序,LinkedHashMap按照给的顺序
        Map<Integer,String> map=new TreeMap<Integer,String>(Comparator.reverseOrder()){{
            put(1000,"M");
            put(900,"CM");
            put(500,"D");
            put(400,"CD");
            put(100,"C");
            put(90,"XC");
            put(50,"L");
            put(40,"XL");
            put(10,"X");
            put(9,"IX");
            put(5,"V");
            put(4,"IV");
            put(1,"I");
        }};
        StringBuilder stringBuilder=new StringBuilder();
        for (int i:map.keySet()) {
            if(num>=i){
                String s = map.get(i);
                int count=num/i;
                for (int j = 0; j < count; j++) {
                    stringBuilder.append(s);
                }
            }
            num%=i;
        }
        return stringBuilder.toString();
    }
}
