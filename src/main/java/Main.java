import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("java");
        Student s2 = new Student("c++");

    }


    public static void swap(Student s1,Student s2){
        String tmp=s1.getName();
        s1.setName(s2.getName());
        s2.setName(tmp);
    }
}
