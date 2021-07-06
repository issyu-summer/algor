package link;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class ALink<T> extends AbstractLink<T>{

    public static void main(String[] args) {
        ALink<Integer> aLink=new ALink<>();
        aLink.addHead(1);
        aLink.addHead(2);
        aLink.addHead(3);
        aLink.addHead(4);
//        aLink.deleteTail();
        aLink.delete(2);
        System.out.println();

    }
}
