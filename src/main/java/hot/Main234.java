package hot;

import java.util.Stack;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main234 {
    public boolean isPalindrome(ListNode head) {
        int count=0;
        Stack<Integer> stack=new Stack<>();
        ListNode t1=head;
        while (t1!=null){
            count++;
            stack.push(t1.val);
            t1=t1.next;
        }
        t1=head;
        for (int i = 0; i < count/2; i++) {
            if(t1.val!=stack.pop()){
                return false;
            }
            t1=t1.next;
        }
        return true;
    }
}
