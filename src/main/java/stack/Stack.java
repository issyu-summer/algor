package stack;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public interface Stack <T>{

    int size();
    void push(T elem);
    T pop();
    boolean isEmpty();
    int cap();
}
