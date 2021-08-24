package code_top.ali;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main141 {

    public boolean hasCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while (true){
            if(fast==null||fast.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
    }
}
