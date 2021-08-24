package to;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main20 {
    Map[] states = {
            Map.of(' ', 0,'s', 1,'d', 2,'.', 4),    // 0.
            Map.of('d', 2,'.', 4),                                  // 1.
            Map.of('d', 2,'.', 3,'e', 5,' ', 8),    // 2.
            Map.of('d', 3,'e', 5,' ', 8),                   // 3.
            Map.of('d',3),                                                  // 4.
            Map.of('s', 6,'d', 7),                                  // 5.
            Map.of('d', 7),                                                 // 6.
            Map.of('d', 7,' ', 8),                                  // 7.
            Map.of(' ', 8)                                                  // 8.
    };

    public boolean isNumber(String s) {
        int p = 0;
        char t;
        for(char c : s.toCharArray()) {
            if(c >= '0' && c <= '9') t = 'd';
            else if(c == '+' || c == '-') t = 's';
            else if(c == 'e' || c == 'E') t = 'e';
            else if(c == '.' || c == ' ') t = c;
            else t = '?';
            if(!states[p].containsKey(t)) return false;
            p = (int)states[p].get(t);
        }
        return p == 2 || p == 3 || p == 7 || p == 8;
    }
}

