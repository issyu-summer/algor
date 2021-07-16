import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
@Data
@AllArgsConstructor
public class Student {

    private String name;
    public void name(){
        System.out.println("name:"+name);
    }
}
