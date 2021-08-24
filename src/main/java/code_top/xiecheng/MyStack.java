package code_top.xiecheng;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class MyStack {
    Queue<Integer> queue;
    Queue<Integer> queue1;

    MyStack(){
        queue=new LinkedList<>();
        queue1=new LinkedList<>();
    }

    void push(int elem){
        if(queue.isEmpty()&&queue1.isEmpty()){
            queue.offer(elem);
        }else if(queue1.isEmpty()){
            queue1.offer(elem);
            while (!queue.isEmpty()){
                queue1.offer(queue.poll());
            }
        }else if(queue.isEmpty()){
            queue.offer(elem);
            while (!queue1.isEmpty()){
                queue.offer(queue1.poll());
            }
        }
    }

    int pop(){
        return queue.isEmpty()?queue1.poll():queue.poll();
    }

    boolean isEmpty(){
        return queue.isEmpty()&&queue1.isEmpty();
    }

    int peek(){
        return queue.isEmpty()?queue1.peek():queue.peek();
    }
}
