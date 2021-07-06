package queue;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public interface Queue <T>{

    void enqueue(T data);

    T dequeue();

    int size();

    boolean isEmpty();


}
