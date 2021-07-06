package stack;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class FixedCapStack<T> extends ArrayStack<T> {

    public FixedCapStack(int cap){
        super(cap);
    }

    public static void main(String[] args) {
        FixedCapStack<Integer> stack=new FixedCapStack(5);
        System.out.println("is empty?："+stack.isEmpty());
        System.out.println("push:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            stack.push(i);
        }
        System.out.println("for - each:");
        for (Integer i:stack) {
            System.out.println(i);
        }
        System.out.println("is empty?："+stack.isEmpty());
        System.out.println("pop:");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
