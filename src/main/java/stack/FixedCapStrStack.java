package stack;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class FixedCapStrStack extends ArrayStack<String> {

    public FixedCapStrStack(int cap){
        super(cap);
    }

    public static void main(String[] args) {
        FixedCapStrStack stack=new FixedCapStrStack(5);
        System.out.println("stack's cap:");
        System.out.println("is empty?："+stack.isEmpty());
        System.out.println("push:");
        for (int i = 0; i < 8; i++) {
            String s="hello,world"+i;
            System.out.println(s);
            stack.push(s);
        }
        System.out.println("for - each:");
        for (String s:stack) {
            System.out.println(s);
        }
        System.out.println("is empty?："+stack.isEmpty());
        System.out.println("pop:");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
