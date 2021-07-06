import java.util.Iterator;

/**
 * 背包<br/>
 * 收集或迭代、不支持删除元素
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Bag<E> implements Iterator<E> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public E next() {
        return null;
    }
}
