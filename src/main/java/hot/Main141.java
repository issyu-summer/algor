package hot;

import java.util.HashSet;
import java.util.Set;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main141 {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        while (head!=null){
            if(!set.add(head)){
                return true;
            }
            head=head.next;
        }
        return false;
    }

    public boolean hasCycle1(ListNode head) {
        ListNode slow=head,fast=head;
        while (true){
            if(fast==null||fast.next==null){
                return false;
            }
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
    }
}
