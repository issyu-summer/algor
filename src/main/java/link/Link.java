package link;

import java.util.LinkedList;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public interface Link <T>{

    void addHead(T elem);

    T removeHead();

    void deleteHead();

    void addTail(T elem);

    T removeTail();

    void deleteTail();

    int size();

}
