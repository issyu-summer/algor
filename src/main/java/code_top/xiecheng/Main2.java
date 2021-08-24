package code_top.xiecheng;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main2 {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(2);
        stack.push(3);
        System.out.println("peek:"+stack.peek());
        System.out.println("pop:"+stack.pop());
        stack.push(4);
        System.out.println("pop:"+stack.pop());;
        System.out.println("pop:"+stack.pop());;
    }
}
